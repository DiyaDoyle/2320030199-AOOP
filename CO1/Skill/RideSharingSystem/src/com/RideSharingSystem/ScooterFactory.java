package com.RideSharingSystem;

public class ScooterFactory extends VehicleFactory{

	@Override
	Vehicle createVehicle() {
		// TODO Auto-generated method stub
		return new Scooter();
	}

}
