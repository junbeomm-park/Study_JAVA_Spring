package di.setter01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		//스프링컨테이너 생성
		ApplicationContext container = new ClassPathXmlApplicationContext("/config/setter.xml");
		
		MyService service = (MyService)container.getBean("service");
		
		service.testLogic();
	}

}
