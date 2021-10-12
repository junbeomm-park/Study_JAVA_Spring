package multi.erp.board;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Boardcontroller {
	@Autowired
	BoardService service;
	@RequestMapping("/board/insert.do")
	public String insert(BoardVO board) { 
		String url = "";
		int result = service.insert(board);
		if(result>=1) {
			url = "redirect:/board/list.do?category=all";
		}else {
			url = "redirect:/board/insertPage.do";
		}
		return url;
	}
	
	
	@RequestMapping("/board/list.do")
	public ModelAndView boardList(String category) {
		System.out.println("==========>"+category);
		ModelAndView mav = new ModelAndView("board/list");
		List<BoardVO> boardlist = service.findByCategory(category);
		//dao에서 결과가 넘어오는 경우 디버깅 작업은 넘어오는 데이터를 sysout으로 컨트롤러 단까지 모두 출력
		mav.addObject("boardlist", boardlist);
		mav.addObject("category", category);
		return mav;
		
	}
	//Ajax로 카테고리별 게시판 데이터를 요청하는 메소드
	//=> 컨트롤러 메스도처럼 ModelAndView를 리턴하지 않고 일반메소드 처럼 ArrayList<BoardVO> 를 리턴하며
	//	 jackson json라이브러리가 자동으로 ArrayList<BoardVO>를 json 으로 변환해서 리턴해준다.
	@RequestMapping(value = "/board/ajax_list.do", method = RequestMethod.GET,
			produces = "application/json;charset=utf-8")
	public @ResponseBody ArrayList<BoardVO> categoryList(String category){
		ArrayList<BoardVO> boardlist =(ArrayList<BoardVO>) service.findByCategory(category);
		System.out.println("ajax통신 : "+boardlist.size());
		return boardlist;
	}
}
