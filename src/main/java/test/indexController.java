package test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/*
	어노테이션을 이용해서 컨트롤러를 작성
	=> 어노테이션을 이용해서 컨트롤러를 작성하는 경우 @Controller로 선언하면 된다.
	=> DispatcherServlet에서 요청할 수 있는 컨트롤러 객체가 된다.(서블릿의 역할)
	=> DispatcherServlet에서 호출할 메소드
	=> 매개변수나 리턴타입으로 정의할 수 있는 타입은 정해져 있지만 그 안에서는 원하는 스펙을 다양하게 적용할 수 있다.
	리턴타입 : String, void, ModelaAndView ..
			String : 뷰에 대한 정보만 담고 있는 경우 -> 컨트롤러의 실행으로 뷰를 실행하려는 경우 (request view의 요청)
			ModelAndView : view와 view에 출력할 데이터정보를 저장(db에서 조회한 데이터를 이용해서 뷰를 만드는 경우 - reponse뷰)
 	매개변수 : String, HttpServletRequest, HttpServletResponse, HttpSession, Model, DTO ...
*/
@Controller
public class indexController {
	//컨트롤러에서 추가한 main()메소드가 실행되도록 하기 위해서 path를 등록
	//=> 어떤 url로 요청하면 main을 실행할 것인지 등록
	//=> @RequestMapping어노테이션을 이용해서 context명 뒤부터
	//     /index.do로 요청하면 IndexController의 main 메소드가 실행되도록 정의(path명은 중복이 불가능)
	@RequestMapping("/index.do")
	public String main() {
		System.out.println("어노테이션 기반 컨트롤러");
		return "test/index"; // view에 대한 정보 - WEB-INF폴더 빼고 확장자뺀 정보
	}
	
	//response할 뷰의 정보와 공유할 데이터의 정보가 모두 필요
	@RequestMapping("/test.do")
	public ModelAndView test() {
		ModelAndView mav = new ModelAndView();
		String result = "컨트롤러에서 공유하는 데이터";
		//데이터 공유
		mav.addObject("result", result); //서블릿작업할때 request,setAttribute("result",result)와 동일
		//뷰이름 셋팅
		mav.setViewName("test/result");
		return mav; //DispatcherServlet에서 알아서 response할 뷰로 result데이터를 사용할 수 있도록 공유
		            //요청재지정의 기본값은 forward
		
	}
}
