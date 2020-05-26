package com.kimschool.manage.service;

import java.util.List;

import com.kimschool.manage.entity.User_Info;
import com.kimschool.manage.entity.Wbs_2020;
import com.kimschool.manage.entity.WorkPlaceInfo;

public interface WbsTestService {

	
	public List<Wbs_2020> select_wbs_2020 (String u_no);
	
	public List<User_Info> select_user_info (String u_no);
	
	public List<WorkPlaceInfo> select_workplaceinfo (String u_no);
}
