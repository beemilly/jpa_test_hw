package com.kimschool.manage.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.kimschool.manage.entity.Jpa_Test;
import com.kimschool.manage.service.RegUserService;

@Controller
public class RegUserController {

	
	@Autowired
	RegUserService service;
	
	private static final Logger logger = LoggerFactory.getLogger(RegUserController.class);
	
	@RequestMapping(value = "/movereguser")
	public String movereguser() {
		
		logger.info("회원가입 화면 이동처리");
		
		return "reguser";
	}
	
	@RequestMapping(value = "/reguser")
	public ModelAndView reguser(String id, String password, String email1, String email2) {
		
		// 회원가입 성공시 -> home.jsp ${msg} -> "회원가입 완료"
		// 회원가입 실패시 -> reguser.jsp (다시 띄운다 : redirect) ${msg} -> "내용을 확인해주세요"
		ModelAndView mv =  new ModelAndView();
		
		int result = service.insertUserInfo(id, password, email1, email2);
		
		if (result == 0) {
			mv.setViewName("login");
			mv.addObject("msg", "회원가입에 정상처리됬습니다.");
		} else {
			mv.setViewName("redirect:/movereguser");
			
		}
				
		return mv;
	}
}
