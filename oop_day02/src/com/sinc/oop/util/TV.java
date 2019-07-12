package com.sinc.oop.util;

public interface TV {
	/*
	public TV() {
		인터페이스는 constructor를 가질 수 없다
	}
	*/
	//public static final int X=0;//상수는 선언과 동시에 명시적인 초기화가 필요
	//근데 public static int해도 파이널 상수락 고 생각함
	public void turnOn();// public abstract void turnOn();이라고 하지 않아도 됨. 인터페이스는 기능구현없이 정의만 하기 때문
	public void turnOff();// 바디부분을 만드는 순간 에러가 난다.
	
}
