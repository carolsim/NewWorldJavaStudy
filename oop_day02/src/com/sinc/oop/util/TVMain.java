package com.sinc.oop.util;

import com.sinc.oop.factory.singleton.TVFactory;

public class TVMain {

	public static void main(String[] args) {
		// TV tv = new TV() <-이거 에러뜬다. 인터페이스로 객체생성 불가능하기 때문
		//TV[] tv = new TV[10];//얘는 타입선언을 하는 것이기 때문에 가능한것임
		/*
		 * TV tv = new LTV(); tv.turnOn();tv.turnOff();
		 */
		TVFactory factory = TVFactory.getInstance();
		TV tv = factory.getTV("lg");
		tv.turnOn();tv.turnOff();

	}
	
}
