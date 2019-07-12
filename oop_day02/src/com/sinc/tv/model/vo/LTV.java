package com.sinc.tv.model.vo;

import com.sinc.oop.util.TV;

public class LTV implements TV {

	@Override
	public void turnOn() {
		System.out.println("LTV turnOn()");
		
	}

	@Override
	public void turnOff() {
		System.out.println("LTV turnOff()");
		
	}
}
