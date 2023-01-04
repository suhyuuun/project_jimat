package service;

import java.util.List;

import dto.DetailpageMapDTO;
import dto.DetailpagePageDTO;

public interface DetailpageMapService {
	public List<DetailpageMapDTO> listProcess(DetailpagePageDTO pv);
	public List<DetailpageMapDTO> f_coordindate(String latitude, String longitude);
	public int countProcess();
	
}
