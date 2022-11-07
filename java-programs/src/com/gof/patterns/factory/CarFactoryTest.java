package com.gof.patterns.factory;

public class CarFactoryTest {

	public static void main(String[] args) {
		Car car;
		
		CarFactory carFactory = new CarFactory();
		
		car = carFactory.getCar("Sedan");
		
		System.out.print(car.type());

	}

}
