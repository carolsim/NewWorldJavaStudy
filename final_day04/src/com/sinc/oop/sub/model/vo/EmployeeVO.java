package com.sinc.oop.sub.model.vo;

import com.sinc.oop.sup.model.vo.PersonVO;

public class EmployeeVO extends PersonVO {
	private String dept;

	public EmployeeVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeeVO(int division, String name, int age, String address, String dept) {
		super(division, name, age, address);
		this.dept = dept;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	//@Override
	public String deptInfo() {
		return super.perInfo()+ "dept=" + dept + "]";
	}
	
	@Override
	public String perInfo() {
		return super.perInfo()+ "dept=" + dept + "]";
	}
	
	
	
}

