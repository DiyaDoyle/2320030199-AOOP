package com.FactoryPattern;

public class MotorcycleFactory extends VehicleFactory {

	@Override
	public Vehicle createVehicle() {
		// TODO Auto-generated method stub
		return new Motorcycle();
	}

}
