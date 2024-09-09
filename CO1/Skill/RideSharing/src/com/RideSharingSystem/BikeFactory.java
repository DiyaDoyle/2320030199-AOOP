package com.RideSharingSystem;

public class BikeFactory extends VehicleFactory{

	@Override
	Vehicle createVehicle() {
		// TODO Auto-generated method stub
		return new Bike();
	}

}