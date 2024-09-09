package com.RideSharingSystem;

public class WalletFactory implements PaymentFactory{

	@Override
	public Payment createPayment() {
		// TODO Auto-generated method stub
		return new Wallet();
	}

}