package com.kimschool.manage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kimschool.manage.dao.WbsTestDao;
import com.kimschool.manage.entity.User_Info;
import com.kimschool.manage.entity.Wbs_2020;
import com.kimschool.manage.entity.WorkPlaceInfo;
@Service
public class WbsTestServiceImpl implements WbsTestService {

	@Autowired
	WbsTestDao dao;
	
	@Override
	public List<Wbs_2020> select_wbs_2020(String u_no) {

		Wbs_2020 wbs = new Wbs_2020();
		wbs.setU_no(u_no);
		
		List<Wbs_2020> result = dao.select_wbs_2020(u_no);
		
		return result;
	}

	@Override
	public List<User_Info> select_user_info(String u_no) {
		
		User_Info user_info = new User_Info();
		user_info.setU_no(u_no);
		
		List<User_Info> result = dao.select_user_info(u_no);
		
		return result;
	}

	@Override
	public List<WorkPlaceInfo> select_workplaceinfo(String u_no) {

		WorkPlaceInfo workplaceinfo = new WorkPlaceInfo();
		workplaceinfo.setU_no(u_no);

		List<WorkPlaceInfo> result = dao.select_workplaceinfo(u_no);
		
		return result;
	}
	
}
