package di.annotation;

import org.springframework.stereotype.Repository;

@Repository
public class CloudLogicImpl implements Logic {
	public void testLogic() {
			System.out.println("AWS클라우드서비스 이용하기");
	}

}
