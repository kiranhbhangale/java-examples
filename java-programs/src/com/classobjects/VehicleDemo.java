package com.classobjects;

//A program that uses the Vehicle class.  

class Vehicle {
	int numberOfPassengers; // number of passengers
	int fuelCapacity; // fuel capacity in gallons
}

//This class declares an object of type Vehicle.

public class VehicleDemo {
	public static void main(String[] args) {
		Vehicle minivan = new Vehicle();

		// assign values to fields in minivan
		minivan.numberOfPassengers = 7;
		minivan.fuelCapacity = 16;

		System.out.println("Passengers " + minivan.numberOfPassengers + " And fuel capacity " + minivan.fuelCapacity);
	}
}