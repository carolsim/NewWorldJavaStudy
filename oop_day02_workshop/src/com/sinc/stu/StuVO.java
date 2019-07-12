package com.sinc.stu;

public class StuVO {
	private String name;
	private int age;
	private int height;
	private int weight;
	public StuVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StuVO(String name, int age, int height, int weight) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
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
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	
	public String studentInfo() {
		return name + "\t" + age + "\t" + height + "\t" + weight;
	}
	
	
	
}
