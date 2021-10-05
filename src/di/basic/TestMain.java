package di.basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		
		
		ApplicationContext context = new GenericXmlApplicationContext("/config/bean.xml");
		System.out.println("=================컨테이너생성후====================");
		Insa insa = context.getBean("insa", Insa.class);
		MemberDTO user = new MemberDTO("jang","1234","장동건");
		insa.addUser(user);

	}

}
