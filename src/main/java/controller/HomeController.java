package controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import dto.DetailpageMapDTO;
import dto.DetailpagePageDTO;
import dto.LibmapDTO;
import service.DetailpageMapService;
import service.LibService;

//http://localhost:8090/myapp/index.do
//http://localhost:8090/myapp/list.do
//http://localhost:8090/myapp/detailpagemap.do

@Controller
public class HomeController {
	private DetailpageMapService dService;
	private LibService lService;
	private DetailpagePageDTO pdto;
	private int currentPage;
	
	public HomeController() {

	}

	public void setService(DetailpageMapService service) {
		this.dService = dService;
	}
	
	public void setlService(LibService lService) {
		this.lService = lService;
	}

	@RequestMapping("/index.do")
	public String indexForm() {
		return "index";
	}

	@RequestMapping("/team_vita500.do")
	public String team_vita500Form() {
		return "team_vita500";
	}

	@RequestMapping("/curation_page.do")
	public String curation_pageForm() {
		return "curation_page";
	}

	@RequestMapping("/one_km_map.do")
	public String one_km_mapForm() {
		return "one_km_map";
	}

	@RequestMapping("/magazine_page.do")
	public String magazine_pageForm() {
		return "magazine_page";
	}

	//검색했을 때 페이지
	@RequestMapping("/search_page_map.do")
	public String search_page_mapForm() {
		return "search_page_map";
	}

	//검색했을 때 페이지
	@ResponseBody
	@RequestMapping(value = "/libmap.do", method = RequestMethod.POST)
	public ModelAndView libraryMap(int pageNo, int pageSize, String keyword, ModelAndView mav) {
		int countAll = lService.f_countAllProcess(keyword);
		int totalPage = countAll / pageSize;
		if ((countAll % pageSize) > 0)
			totalPage++;

		List<LibmapDTO> aList = lService.f_listProcess(pageNo, pageSize, keyword);
		mav.addObject("aList", aList);
		mav.addObject("pageNo", pageNo);
		mav.addObject("totalPage", totalPage);
		mav.setViewName("jsonView");
		return mav;
	}

	@RequestMapping("/my_page.do")
	public String my_pageForm() {
		return "my_page";
	}

	@RequestMapping("/review.do")
	public String reviewForm() {
		return "review";
	}

	//임시 맛집리스트 페이지(추후 수정예정)
	@RequestMapping(value = "/list.do", method = RequestMethod.GET)
	public ModelAndView listMethod(DetailpagePageDTO pv, ModelAndView mav) {
		int totalRecord = dService.countProcess();
		if (totalRecord >= 1) {
			if (pv.getCurrentPage() == 0)
				this.currentPage = 1;
			else
				this.currentPage = pv.getCurrentPage();
			this.pdto = new DetailpagePageDTO(currentPage, totalRecord);
			List<DetailpageMapDTO> aList = dService.listProcess(this.pdto);
			mav.addObject("aList", aList);
			mav.addObject("pv", this.pdto);
		}
		mav.setViewName("list");
		return mav;
	}// listMethod()

	//상세페이지 (지도까지만 구현)
	@RequestMapping(value = "/detailpage.do")
	public ModelAndView detailpagemapMethod(String latitude, String longitude, ModelAndView mav) {
		mav.setViewName("detailpage");
		return mav;
	}// detailpagemapMethod()

}