package app3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/*

	
*/
public class MySpringTest3 {
	public static void main(String[] args) {
		// 1. xml 설정파일을 classpath로 부터 찾아서 정의되어 있는 Bean을 만들고 관리
		ApplicationContext factory = new ClassPathXmlApplicationContext("/config/bean.xml");
		// 2. 컨테이너가 갖고 있는 빈을 lookup하기
		MyBeanStyle obj = (MyBeanStyle)factory.getBean("mybean");
		MyBeanStyle obj2 = (MyBeanStyle)factory.getBean("mybean");
		if(obj==obj2) {//객체의 주소를 비교 - 같은객체인지 비교
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		
		run(obj);
		show(obj);
	}
	public static void run(MyBeanStyle obj) {
		System.out.println("********************");
		obj.testHello("장동건");
		obj.testHello("장동건");
		System.out.println("********************");
	}
	public static void show(MyBeanStyle obj) {
		obj.testHello("장동건");
		obj.testHello("장동건");
		obj.testHello("장동건");
		obj.testHello("장동건");
	}
}
