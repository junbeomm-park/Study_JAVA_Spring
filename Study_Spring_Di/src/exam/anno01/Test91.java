package exam.anno01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Test91 {
	public static void main(String[] args) {
		
		ApplicationContext factory = new GenericXmlApplicationContext("/config/annotation.xml");
		
		IWriteArticleMgr mgr = (IWriteArticleMgr) factory.getBean("mgr");
		mgr.write(new ArticleDTO());
		
		
	}

}