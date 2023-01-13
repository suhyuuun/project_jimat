package service;

import java.util.List;

import dao.DetailpageDao;
import dto.DetailpageMapDTO;

public class DetailpageMapServiceImp implements DetailpageMapService {
	private DetailpageDao dao;

	public DetailpageMapServiceImp() {

	}

	public void setDao(DetailpageDao dao) {
		this.dao = dao;
	}

	@Override
	public List<DetailpageMapDTO> listProcess(DetailpageMapDTO pv) {
		return dao.list(pv);
	}

}
