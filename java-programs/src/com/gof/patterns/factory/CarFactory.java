package com.gof.patterns.factory;

public class CarFactory {
	
	Car carType;

	Car getCar(String car) {
		switch (car) {
		
		case "MiniCar":
			carType = new MiniCar();
			break;

		case "Sedan":
			carType =  new SedanCar();
			break;

		}
		return carType;
	}

}
