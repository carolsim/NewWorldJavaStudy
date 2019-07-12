package com.sinc.mobile;

public class Ltab extends Mobile {

	public Ltab() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ltab(String mobileName, int batterySize, String osType) {
		super(mobileName, batterySize, osType);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int operate(int time) {
		return super.operate(time*10);
	}

	@Override
	public int charge(int time) {
		// TODO Auto-generated method stub
		return super.charge(time*10);
	}
	
	
	
}
