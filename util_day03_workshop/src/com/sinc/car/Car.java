package com.sinc.car;

public class Car {
	private String name;
	private String engine;
	private int oilTank;
	private int oilSize;
	private int distance;
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Car(String name, String engine, int oilTank, int oilSize, int distance) {
		super();
		this.name = name;
		this.engine = engine;
		this.oilTank = oilTank;
		this.oilSize = oilSize;
		this.distance = distance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public int getOilTank() {
		return oilTank;
	}
	public void setOilTank(int oilTank) {
		this.oilTank = oilTank;
	}
	public int getOilSize() {
		return oilSize;
	}
	public void setOilSize(int oilSize) {
		this.oilSize = oilSize;
	}
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance += distance;
	}
	
	public void go(int distance) {
		if (distance>this.oilSize) {
			System.out.println("불가능");
		} else {
			this.oilSize-=distance;
		}
	}
	public void setOil(int oilSize) {
		if (oilSize>this.oilTank) {
			System.out.println("불가능");
		}else {
			this.oilSize +=oilSize;
		}
	}
	
	@Override
	public String toString() {
		return  name + "\t\t" + engine + "\t\t" + oilTank + "\t\t" + oilSize
				+ "\t" + distance ;
	}
	
	
	
}
