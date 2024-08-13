package com.FactoryPattern;

public class Client{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("In main code");
		VehicleFactory obj= new CarFactory();
		obj.createVehicle();
		obj.driveVehicle();

	}

}
