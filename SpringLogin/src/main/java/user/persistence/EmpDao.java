package user.persistence;

import user.domain.EmpDto;

public interface EmpDao {
	
	void register(EmpDto dto) throws Exception;

}
