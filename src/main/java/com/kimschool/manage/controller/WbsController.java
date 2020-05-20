package com.kimschool.manage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.kimschool.manage.entity.User_Info;
import com.kimschool.manage.entity.Wbs_2020;
import com.kimschool.manage.entity.Workplaceinfo;
import com.kimschool.manage.service.WbsService;

@Controller
public class WbsController {

	@Autowired
	WbsService service;
	
	
//	@RequestMapping("/wbs123")
//	public ModelAndView init() {
//		
//		ModelAndView mv = new ModelAndView("wbs");
//		
//		return mv;
//	}
	
	@RequestMapping("wbslogincheck")
	public ModelAndView wbslogincheck(String u_no, String u_password) {
		
		ModelAndView mv = service.wbslogincheck(u_no, u_password);
		
		return mv;
	}
	
	@RequestMapping("getWbsInfo")
	public ModelAndView getwbsinfo (String u_no) {
		
		ModelAndView mv = service.getwbsinfo(u_no);
		
		return mv;
	}
	
	
	
	
}
