package exam;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TVUser {

	public static void main(String[] args) {
		
		ApplicationContext factory = new ClassPathXmlApplicationContext("/config/bean.xml");
		//TV tv = new SamsungTV();
		TV tv = (TV)factory.getBean("Samsung");
		//TV tv = (TV)factory.getBean("LG");
		test(tv);
	}
	public static void test(TV tv){
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
	}
	

}
