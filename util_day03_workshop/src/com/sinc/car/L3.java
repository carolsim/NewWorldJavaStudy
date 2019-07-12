package com.sinc.car;

public class L3 extends Car implements Temp {
	
	
	
	public L3() {
		super();
		// TODO Auto-generated constructor stub
	}

	public L3(String name, String engine, int oilTank, int oilSize, int distance) {
		super(name, engine, oilTank, oilSize, distance);
		// TODO Auto-generated constructor stub
	}
	
	
	
	@Override
	public void go(int distance) {
		// TODO Auto-generated method stub
		super.go(distance/10);
		this.setDistance(distance);
	}

	@Override
	public int getTempGage() {
		
		return this.getDistance()/10;
	}

	@Override
	public String toString() {
		return super.toString() + "\t\t"+this.getTempGage();
	}
	
	
	
	
}
