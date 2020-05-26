package com.kimschool.manage.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "wbs_2020")
@NamedQuery(
		name = "Wbs_2020.selectall",
		query = "select w from Wbs_2020 w where w.u_no = :u_no"
		)


public class Wbs_2020 {

	@Id
	@GeneratedValue
	private int no;
	private String u_no;
	private String date;
	private String start_time;
	private String end_time;
	private String rest_time;
	private String vacation_type;
	private String memo;
	private String reg_date;
	private String upd_date;
	/**
	 * @return the no
	 */
	public int getNo() {
		return no;
	}
	/**
	 * @param no the no to set
	 */
	public void setNo(int no) {
		this.no = no;
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
	 * @return the date
	 */
	public String getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(String date) {
		this.date = date;
	}
	/**
	 * @return the start_time
	 */
	public String getStart_time() {
		return start_time;
	}
	/**
	 * @param start_time the start_time to set
	 */
	public void setStart_time(String start_time) {
		this.start_time = start_time;
	}
	/**
	 * @return the end_time
	 */
	public String getEnd_time() {
		return end_time;
	}
	/**
	 * @param end_time the end_time to set
	 */
	public void setEnd_time(String end_time) {
		this.end_time = end_time;
	}
	/**
	 * @return the rest_time
	 */
	public String getRest_time() {
		return rest_time;
	}
	/**
	 * @param rest_time the rest_time to set
	 */
	public void setRest_time(String rest_time) {
		this.rest_time = rest_time;
	}
	/**
	 * @return the vacation_type
	 */
	public String getVacation_type() {
		return vacation_type;
	}
	/**
	 * @param vacation_type the vacation_type to set
	 */
	public void setVacation_type(String vacation_type) {
		this.vacation_type = vacation_type;
	}
	/**
	 * @return the memo
	 */
	public String getMemo() {
		return memo;
	}
	/**
	 * @param memo the memo to set
	 */
	public void setMemo(String memo) {
		this.memo = memo;
	}
	/**
	 * @return the reg_date
	 */
	public String getReg_date() {
		return reg_date;
	}
	/**
	 * @param reg_date the reg_date to set
	 */
	public void setReg_date(String reg_date) {
		this.reg_date = reg_date;
	}
	/**
	 * @return the upd_date
	 */
	public String getUpd_date() {
		return upd_date;
	}
	/**
	 * @param upd_date the upd_date to set
	 */
	public void setUpd_date(String upd_date) {
		this.upd_date = upd_date;
	}
	@Override
	public String toString() {
		return "Wbs_2020 [no=" + no + ", u_no=" + u_no + ", date=" + date + ", start_time=" + start_time + ", end_time="
				+ end_time + ", rest_time=" + rest_time + ", vacation_type=" + vacation_type + ", memo=" + memo
				+ ", reg_date=" + reg_date + ", upd_date=" + upd_date + "]";
	}
	
	
}
