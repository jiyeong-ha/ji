package user.persistence;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import user.domain.EmpDto;

public class EmpDaoImpl extends SqlSessionDaoSupport implements EmpDao {
	private static final String namespace = "emp";
	@Override
	public void register(EmpDto dto) throws Exception {
		getSqlSession().insert(namespace + ".emp", dto);
	}

}
