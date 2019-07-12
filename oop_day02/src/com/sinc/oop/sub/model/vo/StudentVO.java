package com.sinc.oop.sub.model.vo;

import com.sinc.oop.sup.model.vo.PersonVO;

public class StudentVO extends PersonVO {
	private String stuID;

	public StudentVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/*외부에서 student객체 생성하는 방법 두개
	 * 기본 생성자 사용
	 * 스페션 생성자 사용
	 * But Student클래스에 division등등을 담아 놓을 수 있는 변수가 없다.
	 * 그리고 해당 변수는 private라 상속받지 못한다.
	 * 
	 * */
	
	//이것과
	/*
	 * public StudentVO(int division, String name, int age, String address, String
	 * stuID) { super(); this.setDivision(division); this.setName(name);
	 * this.setAge(age); this.stuID = stuID; }
	 */
	
	//이것은 같은 코드이다.
	public StudentVO(int division, String name, int age, String address, String stuID) {
		super(division,name,age,address);//이 문장으로 한번에 부모를 초기화해서 생성할 수 있다.
		this.stuID = stuID;
	}

	public String getStuID() {
		return stuID;
	}

	public void setStuID(String stuID) {
		this.stuID = stuID;
	}
	//오버라이딩을 해야하지만 지금은 아직 하지않을걸=ㅅ.

	public String stuInfo() {
		return super.perInfo()+ "stuID=" + stuID + "]";
	}
	
	//오버라이드의 전제조건은 함수의 구현부가 모두 일치해야함. 이에 위배되면
	//어노테이션 @Override이 오류를 띄움
	@Override
	public String perInfo() {
		return super.perInfo()+ "stuID=" + stuID + "]"; //super.를 지정해주어야 리커시브콜 오류가 나지않는다.
	}
	
}
