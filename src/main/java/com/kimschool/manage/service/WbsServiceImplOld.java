//package com.kimschool.manage.service;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.web.servlet.ModelAndView;
//
//import com.kimschool.manage.dao.WbsDao;
//import com.kimschool.manage.entity.User_Info;
//import com.kimschool.manage.entity.WbsInfoVo;
//import com.kimschool.manage.entity.Wbs_2020;
//import com.kimschool.manage.entity.Workplaceinfo;
//@Service
//public class WbsServiceImplOld implements WbsService {
//
//	@Autowired
//	WbsDao dao;
//	
//	@Autowired
//	WbsInfoVo wbsvo;
//	
//	
//	@Override
//	public ModelAndView wbslogincheck(String u_no, String u_password) {
//
//		List<User_Info> result = dao.wbslogincheck(u_no, u_password);
//		
//		int count = result.size();
//		
//		ModelAndView mv = new ModelAndView();
//		
//		if(count == 1) {
//			mv.setViewName("redirect:/getWbsInfo?u_no="+u_no);
//		} else {
//			mv.setViewName("login");
//		}
//		
//		return mv;
//	}
//
//	@Override
//	public ModelAndView getwbsinfo(String u_no) {
//
//		WbsInfoVo vo = new WbsInfoVo();
//		
//		List<User_Info> list1 = dao.getwbsinfo_user_info(u_no);
//		
//		for (User_Info user_info : list1) {
//			vo.setName(user_info.getName());
//			vo.setU_no(user_info.getU_no());
//		}
//		
//		List<Workplaceinfo> list2 = dao.getwbsinfo_workplaceinfo(u_no);
//		
//		for (Workplaceinfo workplaceinfo : list2) {
//			vo.setMin_time(workplaceinfo.getMin_time());
//			vo.setMax_time(workplaceinfo.getMax_time());
//		}
//		
//		List<Wbs_2020> list3 = dao.getwbsinfo_wbs_2020(u_no);
//		
//		vo.setWbs_2020List(list3);
//		
//		ModelAndView mv = new ModelAndView("wbs");
//
//		mv.addObject("wbsinfo", vo);
//		
//		return mv;
//	}
//	
//	
//}
//
