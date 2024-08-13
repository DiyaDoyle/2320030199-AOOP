package com.RideSharing;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserAuthentication auth= UserAuthentication.getInstance();
		auth.login("123456");
		if(auth.isAuthenticated()) {
			VehicleFactory vehicleFactory= new CarFactory();
			Vehicle vehicle= vehicleFactory.createVehicle();
			vehicle.drive();

			PaymentFactory paymentFactory= new WalletFactory();
			Payment pay= paymentFactory.createPayment();
			pay.pay(50.00);
		}

		auth.logout();
	}

}
