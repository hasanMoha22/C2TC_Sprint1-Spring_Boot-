package com.tnsif.CollegeService.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "collegedata")
public class College {
	@Id
	@Column(name = "s_id")
	private int s_id;
	@Column(name = "s_name")
	private String s_name;
	@Column(name = "\"year_of_Study\"")
	private String year_of_Study;
	@Column(name = "dept_name")
	private String dept_name;
	@Column(name = "email")
	private String email;
	@Column(name = "phone")
	private String phone;
	@Column(name="gender")
	private String gender;
	public College() {
		super();		
	}
	public College(int s_id, String s_name, String year_of_Study,String dept_name,String email,String phone,String gender) {
		super();
		this.s_id = s_id;
		this.s_name = s_name;
		this.year_of_Study = year_of_Study;
		this.dept_name = dept_name;
		this.email = email;
		this.phone = phone;
		this.gender = gender;
	}

	public int getS_id() {
		return s_id;
	}

	public void setS_id(int s_id) {
		this.s_id = s_id;
	}

	public String getS_name() {
		return s_name;
	}

	public void setS_name(String s_name) {
		this.s_name = s_name;
	}

	public String getYear_of_Study() {
		return year_of_Study;
	}

	public void setYear_of_Study(String year_of_Study) {
		this.year_of_Study = year_of_Study;
	}
	
	public String getdept_name() {
		return dept_name;
	}
	public void setdept_name(String dept_name) {
		this.dept_name = dept_name;
	}
	
	public String getemail() {
		return email;
	}
	public void setemail(String email) {
		this.email = email;
	}
	public String getphone() {
		return phone;
	}
	public void setphone(String phone) {
		this.phone = phone;
	}
	public String getgender() {
		return gender;
	}
	public void setgender(String gender) {
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		return "College [s_id=" + s_id + ", s_name=" + s_name +", dept = "+ dept_name +", phone = "+ phone +", email = " + email + ", Year_of_Study=" + year_of_Study + "]";
	}

}
