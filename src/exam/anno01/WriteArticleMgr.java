package exam.anno01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("mgr")
public class WriteArticleMgr implements IWriteArticleMgr {
	@Autowired
	@Qualifier("mysqlArticleDAO")
	IArticleDAO articleDAO;
	
	public WriteArticleMgr() {
		
	}
	public WriteArticleMgr(IArticleDAO articleDAO) {
		super();
		this.articleDAO = articleDAO;
	}
	
	public void insert(ArticleDTO article) {
		System.out.println("mysql로 insert");
	}
	
	


	@Override
	public void write(ArticleDTO article) {
		articleDAO.insert(article);
	}

}
