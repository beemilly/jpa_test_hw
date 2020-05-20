package com.kimschool.manage.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "user_info")
@NamedQuery(
		name = "User_Info.selectall",
		query = "select u from User_Info u where u.u_no = :u_no"
		)


public class User_Info {

	@Id
	@GeneratedValue
	private int no;
	@Column(insertable = false)
	private String u_no;
	@Column(insertable = false)
	private String name;
	@Column(insertable = false)
	private String gender;
	@Column(insertable = false)
	private String address;
	@Column(insertable = false)
	private String mobile_number;
	@Column(insertable = false)
	private String birthday;
	@Column(insertable = false)
	private String hiredate;
	@Column(insertable = false)
	private String reg_date;
	@Column(insertable = false)
	private String upd_date;
	@Column(insertable = false)
	private String upd_user;
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
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the mobile_number
	 */
	public String getMobile_number() {
		return mobile_number;
	}
	/**
	 * @param mobile_number the mobile_number to set
	 */
	public void setMobile_number(String mobile_number) {
		this.mobile_number = mobile_number;
	}
	/**
	 * @return the birthday
	 */
	public String getBirthday() {
		return birthday;
	}
	/**
	 * @param birthday the birthday to set
	 */
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	/**
	 * @return the hiredate
	 */
	public String getHiredate() {
		return hiredate;
	}
	/**
	 * @param hiredate the hiredate to set
	 */
	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
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
	/**
	 * @return the upd_user
	 */
	public String getUpd_user() {
		return upd_user;
	}
	/**
	 * @param upd_user the upd_user to set
	 */
	public void setUpd_user(String upd_user) {
		this.upd_user = upd_user;
	}
	@Override
	public String toString() {
		return "User_Info [no=" + no + ", u_no=" + u_no + ", name=" + name + ", gender=" + gender + ", address="
				+ address + ", mobile_number=" + mobile_number + ", birthday=" + birthday + ", hiredate=" + hiredate
				+ ", reg_date=" + reg_date + ", upd_date=" + upd_date + ", upd_user=" + upd_user + "]";
	}
	
	
	
}
