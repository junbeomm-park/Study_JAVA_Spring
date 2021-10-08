package multi.erp.emp;

import java.util.List;

public interface EmpService {
	int insert(EmpVO user);
	List<EmpVO> getMemeberlist();
}
