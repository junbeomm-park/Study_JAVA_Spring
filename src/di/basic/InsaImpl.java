package di.basic;
public class InsaImpl implements Insa {
	MemberDAO dao = new MemberDAO();//null - 참조변수를 멤버변수로 선언하면 초기값은 null
	public InsaImpl() {
		System.out.println("InsaImpl의 기본생성자");
	}
	
	public InsaImpl(MemberDAO dao) {
		super();
		this.dao = dao;
		System.out.println("InsaImpl의 매개변수 1개 생성자");
	}

	public MemberDAO getDao() {
		return dao;
	}

	public void setDao(MemberDAO dao) {
		this.dao = dao;
	}

	@Override
	public void addUser(MemberDTO user) {
		dao.add(user);
		
	}

	@Override
	public MemberDTO getUser(String id) {
		dao.getUser("id");
		return null;
	}

}
