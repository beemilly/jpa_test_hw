package com.kimschool.manage.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kimschool.manage.entity.Jpa_Test;
import com.kimschool.manage.entity.User_Info;
import com.kimschool.manage.entity.Wbs_2020;
import com.kimschool.manage.entity.WorkPlaceInfo;
@Repository
public class WbsTestDaoImpl implements WbsTestDao {

	@Autowired
	Connection conn;
	
	
	@Override
	public List<Wbs_2020> select_wbs_2020(String u_no) {

		
		List<Wbs_2020> list = null;
		
		try {
			EntityManager em = conn.getConnection();
			list = em.createNamedQuery("Wbs_2020.selectall", Wbs_2020.class).
					setParameter("u_no", u_no).
					getResultList();
			return list;
		} catch (Exception e) {
			return null;
		}
		
	}


	@Override
	public List<User_Info> select_user_info(String u_no) {

		List<User_Info> list = null;
		
		try {
			EntityManager em = conn.getConnection();
			list = em.createNamedQuery("User_Info.selectall", User_Info.class).
					setParameter("u_no", u_no).
					getResultList();
			return list;
		} catch (Exception e) {
			return null;
		}
	}


	@Override
	public List<WorkPlaceInfo> select_workplaceinfo(String u_no) {

		List<WorkPlaceInfo> list = null;
		
		try {
			EntityManager em = conn.getConnection();
			list = em.createNamedQuery("Workplaceinfo.selectall", WorkPlaceInfo.class).
					setParameter("u_no", u_no).
					getResultList();
			return list;
		} catch (Exception e) {
			return null;
		}
	}

}
