package com.kimschool.manage.dao;					
					
import java.util.List;					
					
import javax.persistence.EntityManager;					
					
import org.springframework.beans.factory.annotation.Autowired;					
import org.springframework.stereotype.Repository;					
					
import com.kimschool.manage.entity.User_Info;					
import com.kimschool.manage.entity.Wbs_2020;					
import com.kimschool.manage.entity.WorkPlaceInfo;					
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

		List<Wbs_2020> list;

			EntityManager em = conn.getConnection();
			list = em.createNamedQuery("Wbs_2020.selectall", Wbs_2020.class).
					setParameter("u_no", u_no).
					getResultList();
			return list;
	}

	@Override
	public List<User_Info> getwbsinfo_user_info(String u_no) {
		
		List<User_Info> list;
		
			EntityManager em = conn.getConnection();
			list = em.createNamedQuery("User_Info.selectall", User_Info.class).
					setParameter("u_no", u_no).
					getResultList();
			return list;
	}

	@Override
	public List<WorkPlaceInfo> getwbsinfo_workplaceinfo(String u_no) {
		
		List<WorkPlaceInfo> list;

			EntityManager em = conn.getConnection();
			list = em.createNamedQuery("WorkPlaceInfo.selectall", WorkPlaceInfo.class).
					setParameter("u_no", u_no).
					getResultList();
			return list;
	}

}
