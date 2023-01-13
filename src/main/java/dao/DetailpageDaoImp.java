package dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;

import dto.DetailpageMapDTO;

public class DetailpageDaoImp implements DetailpageDao {

	public DetailpageDaoImp() {
	
	}
	
	private SqlSessionTemplate sqlSession;

	public void setSqlSession(SqlSessionTemplate sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public List<DetailpageMapDTO> list(DetailpageMapDTO pv) {
		return sqlSession.selectList("res_test.list",pv);
	}
}

