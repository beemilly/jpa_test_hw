package com.kimschool.manage.dao;					
					
import java.util.List;					
					
import javax.persistence.EntityManager;					
					
import org.springframework.beans.factory.annotation.Autowired;					
import org.springframework.stereotype.Repository;					
					
import com.kimschool.manage.entity.User_Info;					
import com.kimschool.manage.entity.Wbs_2020;					
import com.kimschool.manage.entity.Workplaceinfo;					
@Repository					
public class WbsDaoImpl implements WbsDao {					
	
	
	@Autowired
	Connection conn;

	@Override
	public List<User_Info> wbslogincheck(String u_no, String u_password) {
					
		EntityManager em = conn.getConnection();
		List<User_Info> result = em.createNamedQuery("User_Info.findByUserInfo", User_Info.class).
				setParameter("u_no", u_no).
				setParameter("u_password", u_password).
				getResultList();

		return result;
	}

	@Override
	public List<Wbs_2020> getwbsinfo_wbs_2020(String u_no) {

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
	public List<User_Info> getwbsinfo_user_info(String u_no) {
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
	public List<Workplaceinfo> getwbsinfo_workplaceinfo(String u_no) {
		List<Workplaceinfo> list = null;

		try {
			EntityManager em = conn.getConnection();
			list = em.createNamedQuery("Workplaceinfo.selectall", Workplaceinfo.class).
					setParameter("u_no", u_no).
					getResultList();
			return list;
		} catch (Exception e) {
			return null;
		}
	}

}
