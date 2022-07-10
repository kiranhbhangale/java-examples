package com.classobjects;

//A program that uses the Vehicle class.  

class Vehicle {
	int passengers; // number of passengers
	int fuelcap; // fuel capacity in gallons
}

//This class declares an object of type Vehicle.  
public class VehicleDemo {
	public static void main(String[] args) {
		Vehicle minivan = new Vehicle();

		// assign values to fields in minivan
		minivan.passengers = 7;
		minivan.fuelcap = 16;

		System.out.println("Passengers " + minivan.passengers + " And fuel capacity " + minivan.fuelcap);
	}
}