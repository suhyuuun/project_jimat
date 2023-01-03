package dao;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;

import dto.DetailpageMapDTO;
import dto.DetailpagePageDTO;

public class DetailpageDaoImp implements DetailpageDao {

	public DetailpageDaoImp() {
	
	}
	
	private SqlSessionTemplate sqlSession;

	public void setSqlSession(SqlSessionTemplate sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	@Override
	public List<DetailpageMapDTO> res_coordindate(HashMap<String, Object> coor) {
		return sqlSession.selectList("res_test.res_coordinate", coor);
		
	}

	@Override
	public List<DetailpageMapDTO> list(DetailpagePageDTO pv) {
		return sqlSession.selectList("res_test.list",pv);
	}

	@Override
	public int count() {
		return sqlSession.selectOne("res_test.count");
	}
}
