package controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import dto.DetailpageMapDTO;
import service.DetailpageMapService;

//http://localhost:8090/myapp/list.do
//http://localhost:8090/myapp/detailpagemap.do

@Controller
public class HomeController {
	private DetailpageMapService service;

	public HomeController() {

	}
	public void setService(DetailpageMapService service) {
		this.service = service;
	}

	// 임시 맛집리스트 페이지(추후 수정예정)
	@RequestMapping(value = "/list.do", method = RequestMethod.GET)
	public ModelAndView listMethod(DetailpageMapDTO pv, ModelAndView mav) {
		List<DetailpageMapDTO> aList = service.listProcess(pv);
		mav.addObject("aList", aList);
		mav.setViewName("list");
		return mav;
	}// listMethod()

	@RequestMapping("/detailpage.do")
	public String detailpageMethod(HttpServletRequest httpServletRequest, Model model) {
		String latitude = httpServletRequest.getParameter("latitude");
		String longitude = httpServletRequest.getParameter("longitude");
		String foodtype = httpServletRequest.getParameter("foodtype");
		String img_url = httpServletRequest.getParameter("img_url");
		String foodstore_id = httpServletRequest.getParameter("foodstore_id");
		String foodstroe_num = httpServletRequest.getParameter("foodstroe_num");
		String road_name = httpServletRequest.getParameter("road_name");
		String rate = httpServletRequest.getParameter("rate");
		String openinghours = httpServletRequest.getParameter("openinghours");

		model.addAttribute("latitude", latitude);
		model.addAttribute("longitude", longitude);
		model.addAttribute("foodtype", foodtype);
		model.addAttribute("img_url", img_url);
		model.addAttribute("foodstore_id", foodstore_id);
		model.addAttribute("foodstroe_num", foodstroe_num);
		model.addAttribute("road_name", road_name);
		model.addAttribute("rate", rate);
		model.addAttribute("openinghours",openinghours);
		return "detailpage";
	}
}