package com.kimschool.manage.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.kimschool.manage.dao.WbsDao;
import com.kimschool.manage.entity.User_Info;
import com.kimschool.manage.entity.Wbs;
import com.kimschool.manage.entity.WbsInfoVo;
import com.kimschool.manage.entity.Wbs_2020;
import com.kimschool.manage.entity.WorkPlaceInfo;

@Service
public class WbsServiceImpl implements WbsService {

	@Autowired
	WbsDao wbsDao;

	@Override
	public ModelAndView wbslogincheck(String u_no, String u_password) {

		List<User_Info> result = wbsDao.wbslogincheck(u_no, u_password);
		
		int count = result.size();
		
		ModelAndView mv = new ModelAndView();
		
		if (count == 1) {
			mv.addObject("u_no", u_no);
			mv.setViewName("redirect:/getwbsinfo");
		} else {
			mv.setViewName("login");
		}
		
		return mv;
	}

	@Override
	public ModelAndView getwbsinfo(String u_no) throws Throwable {
		
		ModelAndView mv = new ModelAndView("wbs");
		
		List<Wbs_2020> wbs_2020 = new ArrayList<Wbs_2020>();
		List<User_Info> user_info = new ArrayList<User_Info>();
		List<WorkPlaceInfo> workplaceinfo = new ArrayList<WorkPlaceInfo>();
		
		wbs_2020 = wbsDao.getwbsinfo_wbs_2020(u_no);
		user_info = wbsDao.getwbsinfo_user_info(u_no);
		workplaceinfo = wbsDao.getwbsinfo_workplaceinfo(u_no);
		
		WbsInfoVo vo = new WbsInfoVo();
		
		vo.setU_name(user_info.get(0).getName());
		vo.setU_no(user_info.get(0).getU_no());
		vo.setMin_time(String.valueOf(workplaceinfo.get(0).getMin_time()));
		vo.setMax_time(String.valueOf(workplaceinfo.get(0).getMax_time()));
		
		List<Wbs> wbslist = new ArrayList<Wbs>();
		
		for (Wbs_2020 wbs : wbs_2020) {
			Wbs wbsvo = new Wbs();
			wbsvo.setDate(wbs.getDate());
			
			String start_time_h = "0";
			String start_time_m = "0";
			
			if (wbs.getStart_time().equals("0")) {
				start_time_h = "0";
				start_time_m = "0";
			} else if (wbs.getStart_time().length() == 4) {
				start_time_h = (wbs.getStart_time().substring(0, 2));
				start_time_m = (wbs.getStart_time().substring(2, 4));
			}
			
			wbsvo.setStart_h(start_time_h);
			wbsvo.setStart_m(start_time_m);
			
			String end_time_h = "0";
			String end_time_m = "0";
			
			if (wbs.getEnd_time().equals("0")) {
				end_time_h = "0";
				end_time_m = "0";
			} else if (wbs.getEnd_time().length() == 4) {
				end_time_h = wbs.getEnd_time().substring(0, 2);
				end_time_m = wbs.getEnd_time().substring(2, 4);
			}
			
			wbsvo.setEnd_h(end_time_h);
			wbsvo.setEnd_m(end_time_m);
			
			String rest_time_h = "0";
			String rest_time_m = "0";
			
			if (wbs.getRest_time().equals("0")) {
				rest_time_h = "0";
				rest_time_m = "0";
			} else if (wbs.getRest_time().length() == 4) {
				rest_time_h = wbs.getRest_time().substring(0, 2);
				rest_time_m = wbs.getRest_time().substring(2, 4);
			}
			
			wbsvo.setRest_h(rest_time_h);
			wbsvo.setRest_m(rest_time_m);

			int s_t_h = Integer.parseInt(start_time_h);
			int s_t_m = Integer.parseInt(start_time_m);
			int e_t_h = Integer.parseInt(end_time_h);
			int e_t_m = Integer.parseInt(end_time_m);
			int r_t_h = Integer.parseInt(rest_time_h);
			int r_t_m = Integer.parseInt(rest_time_m);
			
			int total_time_h = 0;
			int total_time_m = 0;
			
			if (s_t_m + r_t_m > e_t_m) {
				total_time_h = e_t_h - s_t_h - r_t_h - 1;
				total_time_m = 60 + e_t_m - s_t_m - r_t_m;
			} else {
				total_time_h = e_t_h - s_t_h - r_t_h;
				total_time_m = e_t_m - s_t_m - r_t_m;
			}
			
			String totla_time_h_set = Integer.toString(total_time_h);
			String totla_time_m_set = Integer.toString(total_time_m);
			
			wbsvo.setTotal_h(totla_time_h_set);
			wbsvo.setTotal_m(totla_time_m_set);
			
			if (wbs.getVacation_type().equals("0")) {
				wbsvo.setVacation_type("");	
			} else if (wbs.getVacation_type().equals("1")) {
				wbsvo.setVacation_type("午前休暇");	
			} else if (wbs.getVacation_type().equals("2")) {
				wbsvo.setVacation_type("午後休暇");	
			} else if (wbs.getVacation_type().equals("3")) {
				wbsvo.setVacation_type("休暇");	
			} else if (wbs.getVacation_type().equals("4")) {
				wbsvo.setVacation_type("早退");	
			}
			
			wbsvo.setMemo(wbs.getMemo());

			SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");
			Date date = format.parse(wbs.getDate());
			
			Calendar cal = Calendar.getInstance() ;
			cal.setTime(date); 
			
			int dayNum = cal.get(Calendar.DAY_OF_WEEK);
			
			if (dayNum == 1) {
				wbsvo.setWeekday("[火]");
			} else if (dayNum == 2){
				wbsvo.setWeekday("[水]");
			} else if (dayNum == 3){
				wbsvo.setWeekday("[木]");
			} else if (dayNum == 4){
				wbsvo.setWeekday("[金]");
			} else if (dayNum == 5){
				wbsvo.setWeekday("[土]");
			} else if (dayNum == 6){
				wbsvo.setWeekday("[日]");
			} else if (dayNum == 7){
				wbsvo.setWeekday("[月]");
			}
			
			
			wbslist.add(wbsvo);
		}
		
		vo.setWbslist(wbslist);
		
		int count_day = 0;
		
		int count_d = 0;
		
		while (count_d < wbslist.size()) {
			if (wbslist.get(count_d).getStart_h().equals("0")) {
				count_day += 0;
				count_d ++;
			} else {
				count_day += 1;
				count_d ++;
			}
		}
		
		vo.setTotal_work_day(count_day);
		
		int count_time_h = 0;
		int count_time_m = 0;
		
		int count_t = 0;
		
		while (count_t < wbslist.size()) {
			if (wbslist.get(count_t).getTotal_h().equals("0")) {
				count_time_h += 0;
				count_time_m += 0;
				count_t ++;
			} else {
				String hour = wbslist.get(count_t).getTotal_h();
				String minute = wbslist.get(count_t).getTotal_m();
				
				int hour_set = Integer.parseInt(hour);
				int minute_set = Integer.parseInt(minute);
				
				count_time_h += hour_set;
				count_time_m += minute_set; 
				count_t ++;
			}
		}
		
		if (count_time_m < 60) {
			count_time_h += 0;
			count_time_m += 0;
		} else if (count_time_m >= 60) {
			count_time_h += count_time_m / 60;
			count_time_m = count_time_m % 60 ;
		} 
		
		vo.setTotal_work_time_h(count_time_h);
		vo.setTotal_work_time_m(count_time_m);
		
		mv.addObject("wbsinfo", vo);
		
		return mv;
	}

}


