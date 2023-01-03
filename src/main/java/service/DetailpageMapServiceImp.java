package service;

import java.util.HashMap;
import java.util.List;

import dao.DetailpageDao;
import dto.DetailpageMapDTO;
import dto.DetailpagePageDTO;

public class DetailpageMapServiceImp implements DetailpageMapService {
	private DetailpageDao dao;

	public DetailpageMapServiceImp() {

	}

	public void setDao(DetailpageDao dao) {
		this.dao = dao;
	}
	
	@Override
	public List<DetailpageMapDTO> f_coordindate(String latitude, String longitude) {
		HashMap<String, Object> coordinate = new HashMap<String, Object>();
		coordinate.put("latitude", latitude);
		coordinate.put("longitude", longitude);
		return dao.res_coordindate(coordinate);
	}

	@Override
	public List<DetailpageMapDTO> listProcess(DetailpagePageDTO pv) {
		return dao.list(pv);
	}

	@Override
	public int countProcess() {
		return dao.count();
	}
}
