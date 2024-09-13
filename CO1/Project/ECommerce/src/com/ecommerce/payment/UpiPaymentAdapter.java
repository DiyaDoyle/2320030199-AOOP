package com.ecommerce.payment;

public class UpiPaymentAdapter implements PaymentProcessor{
	private UpiPaymentProcessor upi;
	
	public UpiPaymentAdapter(UpiPaymentProcessor upi) {
		this.upi= upi;
	}

	@Override
	public void processPayment(double amount, String... details) {
		// TODO Auto-generated method stub
		upi.UpiPayment(amount, details[0]);
	}

}
