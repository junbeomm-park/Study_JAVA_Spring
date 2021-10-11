package main;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import multi.erp.board.BoardService;
import multi.erp.board.BoardVO;

@Controller
public class IndexController {
	@Autowired
	BoardService service;
	@RequestMapping("/index.do")
	public ModelAndView index() {
		ModelAndView mav = new ModelAndView("index");
		//index뷰에서 게시판 카테고리의 목록을 조회해야 하므로 
		List<BoardVO> boardlist = service.findByCategory("게시판");
		mav.addObject("boardlist", boardlist);
		return mav; 
	}
	
//	@RequestMapping("/emp/login.do")
//	public String advancedView() {
//		return "login"; //tiles설정 파일에 등록된 view의 이름
//	}
	
	@RequestMapping("/menu/board.do")
	public String jdbcView() {
		return "board/list";
	}
	
}

