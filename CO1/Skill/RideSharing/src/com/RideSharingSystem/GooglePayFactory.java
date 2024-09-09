package com.RideSharingSystem;

public class GooglePayFactory implements PaymentFactory{

	@Override
	public Payment createPayment() {
		// TODO Auto-generated method stub
		return new GooglePay();
	}
}