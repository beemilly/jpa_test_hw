package com.kimschool.manage.entity;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;


@Component
public class WbsInfoVoOld  {

	String name;
	String u_no;
	
	int min_time;
	int max_time;

	List<Wbs_2020> wbs_2020List = new ArrayList<Wbs_2020>();

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the u_no
	 */
	public String getU_no() {
		return u_no;
	}

	/**
	 * @param u_no the u_no to set
	 */
	public void setU_no(String u_no) {
		this.u_no = u_no;
	}

	/**
	 * @return the min_time
	 */
	public int getMin_time() {
		return min_time;
	}

	/**
	 * @param min_time the min_time to set
	 */
	public void setMin_time(int min_time) {
		this.min_time = min_time;
	}

	/**
	 * @return the max_time
	 */
	public int getMax_time() {
		return max_time;
	}

	/**
	 * @param max_time the max_time to set
	 */
	public void setMax_time(int max_time) {
		this.max_time = max_time;
	}

	/**
	 * @return the wbs_2020List
	 */
	public List<Wbs_2020> getWbs_2020List() {
		return wbs_2020List;
	}

	/**
	 * @param wbs_2020List the wbs_2020List to set
	 */
	public void setWbs_2020List(List<Wbs_2020> wbs_2020List) {
		this.wbs_2020List = wbs_2020List;
	}

	@Override
	public String toString() {
		return "WbsInfoVo [name=" + name + ", u_no=" + u_no + ", min_time=" + min_time + ", max_time=" + max_time
				+ ", wbs_2020List=" + wbs_2020List + "]";
	}
	
	
	
}
