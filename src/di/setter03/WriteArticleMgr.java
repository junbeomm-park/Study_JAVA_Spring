package di.setter03;
//service의 역할을 하는 클래스
public class WriteArticleMgr implements IWriteArticleMgr {
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

	public void setArticleDAO(IArticleDAO articleDAO) {
		this.articleDAO = articleDAO;
	}
	@Override
	public void write(ArticleDTO article) {
		articleDAO.insert(article);
	}

}
