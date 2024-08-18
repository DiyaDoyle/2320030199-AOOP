package com.RideSharing;

public class Wallet implements Payment{

	@Override
	public void pay(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Paying "+amount+" via Wallet");
	}

}
