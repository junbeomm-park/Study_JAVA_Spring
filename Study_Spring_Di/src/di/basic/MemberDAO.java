package di.basic;
public class MemberDAO {
	public MemberDAO() {
		System.out.println("memberdao의 기본생성자");
	}
	public void add(MemberDTO user){
		System.out.println("회원가입");
	}
	public MemberDTO getUser(String id){
		System.out.println("회원정보조회");
		return null;
	}
}