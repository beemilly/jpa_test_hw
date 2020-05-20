package com.kimschool.manage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.kimschool.manage.entity.User_Info;
import com.kimschool.manage.entity.Wbs_2020;
import com.kimschool.manage.entity.Workplaceinfo;
import com.kimschool.manage.service.WbsTestService;

@Controller
public class WbsTestController {

	@Autowired
	WbsTestService service;
	
	@RequestMapping("wbstest")
	
	public ModelAndView wbstest(String u_no) {
		
		ModelAndView mv = new ModelAndView("wbs_test");
		
		List<Wbs_2020> list = service.select_wbs_2020(u_no);
		
		List<User_Info> list2 = service.select_user_info(u_no);
		
		List<Workplaceinfo> list3 = service.select_workplaceinfo(u_no);
		
		mv.addObject("list", list);
		mv.addObject("list2", list2);
		mv.addObject("list3", list3);
		return mv;
	}
	
}
