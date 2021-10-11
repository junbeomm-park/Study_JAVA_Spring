package multi.erp.emp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Empcontroller {
	@Autowired
	EmpService service;
	@RequestMapping("/emp/insert.do")
	//스프링 MVC의 DispatcherServlet이 넘겨주는 VO객체를 서비스단의 매소드를 호출하면서 넘겨준다.
	public String insert(EmpVO command) { //VO객체를 command객체라 한다.
		System.out.println("==============="+command);
		service.insert(command);
		return "redirect:/emp/loginPage.do";
				
	}
	@RequestMapping("emp/list.do")
	public ModelAndView getMemberlist() {
		ModelAndView mav = new ModelAndView();
		List<EmpVO> userlist = service.getMemeberlist();
		System.out.println("*********************************");
		System.out.println(userlist);
		//tiles에 등록한 뷰의 이름
		mav.setViewName("emp/list");
		mav.addObject("userlist", userlist);
		return mav;
		
	}
	//원래 웹을 요청하는 방식(동기) => emp/insert로 등록한 뷰의 모든 html태그가 서버에서 클라이언트로 전송된다.
	@RequestMapping("/emp/idcheck.do")
	public ModelAndView idCheck(String id) {
		ModelAndView mav = new ModelAndView();
		boolean state = service.idCheck(id);
		String result = "";
		if(state) {//사용자가 입력한 id가 db에 이미 저장되어 있다는 의미
			result = "사용 불가능한 아이디";
		}else {
			result = "사용 가능한 아이디";
		}
		mav.setViewName("emp/insert");
		mav.addObject("result", result);
		return mav;
	}
}
