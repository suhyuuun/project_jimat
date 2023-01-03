package controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import dto.DetailpageMapDTO;
import dto.DetailpagePageDTO;
import service.DetailpageMapService;


//http://localhost:8090/myapp/list.do
//http://localhost:8090/myapp/detailpagemap.do

@Controller
public class DetailpageController {
	private DetailpageMapService service;
	private DetailpagePageDTO pdto;
	private int currentPage;

	public DetailpageController() {

	}

	public void setService(DetailpageMapService service) {
		this.service = service;
	}

	@RequestMapping(value = "/list.do", method = RequestMethod.GET)
	public ModelAndView listMethod(DetailpagePageDTO pv, ModelAndView mav) {
		int totalRecord = service.countProcess();
		if (totalRecord >= 1) {
			if (pv.getCurrentPage() == 0)
				this.currentPage = 1;
			else
				this.currentPage = pv.getCurrentPage();
			this.pdto = new DetailpagePageDTO(currentPage, totalRecord);
			List<DetailpageMapDTO> aList = service.listProcess(this.pdto);
			mav.addObject("aList", aList);
			mav.addObject("pv", this.pdto);
		}
		mav.setViewName("list");
		return mav;
	}// listMethod()
	

	@RequestMapping(value = "/detailpagemap.do")
	public ModelAndView detailpagemapMethod(String latitude, String longitude, ModelAndView mav) {
		mav.setViewName("detailpagemap");
		return mav;
	}//detailpagemapMethod()


	
}