package com.sinc.oop.sup.model.vo;

public class PersonVO {
	private int		division;
	private String	name;
	private int		age;
	private	String	address;
	
	public PersonVO() {
		
		super();//없애도 묵시적으로 생기는 것. 첫번쨰 줄에 묵시적으로 부모를 생성하는 컨스트럭터가 들어감.
		
	}
	
	public PersonVO(int division, String name, int age, String address) {
		super();
		this.division = division;
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	public int getDivision() {
		return division;
	}
	public void setDivision(int division) {
		this.division = division;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	//annotation을 붙이면 컴파일 시점에 문법을 좀 더 강하게 체크할 수 있다. @가 어노테이션. 일단 지금은 쓰지 않음
	//@Override
	public String perInfo() {
		return "PersonVO [division=" + division + ", name=" + name + ", age=" + age + ", address=" + address + ",";
	}
	
	
	
	
}
