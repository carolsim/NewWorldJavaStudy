package com.sinc.oop.sub.model.vo;

import com.sinc.oop.sup.model.vo.PersonVO;

public class TeacherVO extends PersonVO {
	private String subject;

	public TeacherVO() {
		super();
		// TODO Auto-generated constructor stub
	}


	public TeacherVO(int division, String name, int age, String address, String subject) {
		super(division, name, age, address);
		this.subject = subject;
	}
	
	


	public String getSubject() {
		return subject;
	}


	public void setSubject(String subject) {
		this.subject = subject;
	}


	//@Override
	public String subInfo() {
		return super.perInfo() + "subject=" + subject + "]";
	}
	
	@Override
	public String perInfo() {
		return super.perInfo() + "subject=" + subject + "]";
	}
	
	
	
}
