package com.sinc.mobile;

public class Otab extends Mobile{

	public Otab() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Otab(String mobileName, int batterySize, String osType) {
		super(mobileName, batterySize, osType);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int operate(int time) {
		// TODO Auto-generated method stub
		return super.operate(time*12);
	}

	@Override
	public int charge(int time) {
		// TODO Auto-generated method stub
		return super.charge(time*8);
	}
	
	
}
