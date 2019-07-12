package com.sinc.vehicle;

public class Car extends Vehicle{
	private double restOil;
	private int	curWeight;
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Car(int maxWeight, double oilTankSize, double efficiency) {
		super(maxWeight, oilTankSize, efficiency);
		// TODO Auto-generated constructor stub
	}
	public Car(double restOil, int curWeight) {
		super();
		this.restOil = restOil;
		this.curWeight = curWeight;
	}
	public double getRestOil() {
		return restOil;
	}
	public void setRestOil(double restOil) {
		this.restOil = restOil;
	}
	public int getCurWeight() {
		return curWeight;
	}
	public void setCurWeight(int curWeight) {
		this.curWeight = curWeight;
	}
	public void addOil(int oil) {
		super.getOilTankSize();
	}
	public void addWeight(int weight) {
		this.curWeight+=weight;
	}
	
	
	@Override
	public String toString() {
		return "Car [restOil=" + restOil + ", curWeight=" + curWeight + "]";
	}
	
}
