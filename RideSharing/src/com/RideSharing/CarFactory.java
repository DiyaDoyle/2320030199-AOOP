package com.RideSharing;

public class CarFactory extends VehicleFactory{

	@Override
	Vehicle createVehicle() {
		// TODO Auto-generated method stub
		return new Car();
	}

}
