package com.sinc.cal;

public class Calc {
	private int a, b, c, d;
	
	public Calc() {
		super();
		this.a =(int) Math.random()*100;
		this.b =(int) Math.random()*100;
		this.c =(int) Math.random()*100;
		this.d =(int) Math.random()*100;
	}
	
	
	
	public Calc(int a, int b, int c, int d) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}



	public int calcSum(int a, int b, int c, int d){
		int sum=a+b+c+d;
		return sum;
	}



	
	
	
}
