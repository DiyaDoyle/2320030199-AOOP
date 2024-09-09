package com.RideSharingSystem;

public class PhonePeFactory implements PaymentFactory{

	@Override
	public Payment createPayment() {
		// TODO Auto-generated method stub
		return new PhonePe();
	}

}
