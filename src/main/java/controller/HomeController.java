package controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import dto.DetailpageMapDTO;
import dto.DetailpagePageDTO;
import service.DetailpageMapService;

//http://localhost:8090/myapp/index.do
//http://localhost:8090/myapp/list.do
//http://localhost:8090/myapp/detailpagemap.do

@Controller
public class HomeController {
	private DetailpageMapService service;
	private DetailpagePageDTO pdto;
	private int currentPage;

	public HomeController() {

	}

	public void setService(DetailpageMapService service) {
		this.service = service;
	}

	@RequestMapping("/index.do")
	public String indexFrom() {
		return "index";
	}
	
	@RequestMapping("/team_vita500.do")
	public String team_vita500From() {
		return "team_vita500";
	}

	@RequestMapping("/curation_page.do")
	public String curation_pageFrom() {
		return "curation_page";
	}

	@RequestMapping("/one_km_map.do")
	public String one_km_mapFrom() {
		return "one_km_map";
	}

	@RequestMapping("/magazine_page.do")
	public String magazine_pageFrom() {
		return "magazine_page";
	}

	@RequestMapping("/my_page.do")
	public String my_pageFrom() {
		return "my_page";
	}

	@RequestMapping("/review.do")
	public String reviewFrom() {
		return "review";
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

	@RequestMapping(value = "/detailpage.do")
	public ModelAndView detailpagemapMethod(String latitude, String longitude, ModelAndView mav) {
		mav.setViewName("detailpage");
		return mav;
	}// detailpagemapMethod()

}