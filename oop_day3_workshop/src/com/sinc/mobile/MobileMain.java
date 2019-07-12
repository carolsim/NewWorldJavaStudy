package com.sinc.mobile;

public class MobileMain {

	public static void main(String[] args) {
		Mobile[] m = new Mobile[10];
		
		m[0]= new Ltab("Ltab",500,"AP-01");
		m[1]= new Otab("Otab",1000,"AND-20");
		
		System.out.println("Mobile\t\tBattery\t\tOS");
		System.out.println("_____________________________________");
		for(int i=0;i<m.length;i++) {
			if(m[i]==null) {
				continue;
			}else {
				System.out.println(m[i]);
				System.out.println(m[i].charge(10));
			}
			
		}
		
		
		System.out.println("Mobile\t\tBattery\t\tOS");
		System.out.println("_____________________________________");
		for(int i=0;i<m.length;i++) {
			if(m[i]==null) {
				continue;
			}else {
				System.out.println(m[i]);
				System.out.println(m[i].operate(5));
			}
		}
		System.out.println("Mobile\t\tBattery\t\tOS");
		System.out.println("_____________________________________");
		for(int i=0;i<m.length;i++) {
			if(m[i]==null) continue;
			System.out.println(m[i]);
		}

	}

}
