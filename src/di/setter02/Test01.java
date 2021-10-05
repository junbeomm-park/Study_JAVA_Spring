package di.setter02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Test01 {
	public static void main(String[] args) {
		
		ApplicationContext factory = new GenericXmlApplicationContext("/config/setter.xml");
		
		AbstractPlayer p = (AbstractPlayer)factory.getBean("player");
		p.play();
		System.out.println("세번 굴린 주사위의 합:"+p.getTotalValue());
		
		
	}

}
