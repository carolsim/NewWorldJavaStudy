package com.sinc.tv.model.vo;

import com.sinc.oop.util.TV;

/*추상 클래스*/
public class STV implements TV {
	
	//public abstract class STV implements TV 이거 하면 가능하다. 객체를 추상화 사킬 수 있음.
	//얘는 abstract 를 하거나 바디를 구현해야한다.
	//public void change();
	//public abstract void change(); 또는 public void change(){}

	@Override
	public void turnOn() {
		System.out.println("STV turnOn()");
		
	}

	@Override
	public void turnOff() {
		System.out.println("STV turnOn()");
		
	} 
	
}
