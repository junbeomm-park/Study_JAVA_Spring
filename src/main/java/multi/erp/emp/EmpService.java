package multi.erp.emp;

import java.util.List;

public interface EmpService {
	int insert(EmpVO user);
	List<EmpVO> getMemeberlist();
	boolean idCheck(String id);
	EmpVO login(EmpVO loginUser);
}
