package com.sinc.car;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CarMain {

	public static void main(String[] args) {
		List<Car> cars = new ArrayList<Car>();
		cars.add(new L3("L3","1500",50,25,0));
		cars.add(new L5("L5","2000",75,35,0));
		Iterator<Car> ite = cars.iterator();
		
		System.out.println("vehicleName\tengineSize\toilTank\t\toilSize\tdistance\ttemperature");
		System.out.println("____________________________________________________________________________________");
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		
		
		System.out.println("vehicleName\tengineSize\toilTank\t\toilSize\tdistance\ttemperature");
		System.out.println("____________________________________________________________________________________");
		ite = cars.iterator();
		while(ite.hasNext()) {
			Car car = ite.next();
			car.setOil(25);
			System.out.println(car);
		}
		System.out.println("vehicleName\tengineSize\toilTank\t\toilSize\tdistance\ttemperature");
		System.out.println("____________________________________________________________________________________");
		ite = cars.iterator();
		while(ite.hasNext()) {
			Car car = ite.next();
			car.go(80);
			System.out.println(car);
		}
		
	}

}
