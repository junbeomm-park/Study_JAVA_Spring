package exam.anno01;

import org.springframework.stereotype.Repository;

@Repository
public class MysqlArticleDAO implements IArticleDAO {
	@Override
	public void insert(ArticleDTO article) {
		System.out.println("mysql로 insert");
	}

}
