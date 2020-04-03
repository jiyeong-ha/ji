package user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import user.domain.EmpDto;
import user.persistence.EmpDao;

@Service
public class EmpServiceImpl implements EmpService {
	
	@Autowired
	private EmpDao dao;

	@Override
	public void register(EmpDto dto) throws Exception {
		dao.register(dto);
		

	}

}
