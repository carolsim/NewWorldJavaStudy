package com.sinc.test.model.vo;
/*
 * CREATE TABLE WEB_TEST_MER_TBL
 * 		ID	VARCHAR2(50)	PRIMARY KEY,
 * 		PWD	VARCHAR2(50)	NOT NULL,
 * 		NAME	VARCHAR2(50)	NOT NULL,
 * 		DEPT	VARCHAR2(50)	DEFAULT '인사(임)',
 * 		POINT	NUMBER
 * 
 * 
 * 
 * */





public class TestVO {
	private String id, pwd, name, dept;
	private int point;
	public TestVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TestVO(String id, String pwd, String name, String dept, int point) {
		super();
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.dept = dept;
		this.point = point;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	@Override
	public String toString() {
		return "TestVO [id=" + id + ", pwd=" + pwd + ", name=" + name + ", dept=" + dept + ", point=" + point + "]";
	}
	
}
