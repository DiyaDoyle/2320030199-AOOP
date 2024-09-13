package com.ecommerce.payment;

public class CardPayment {
	public void cardPayment(double amount, String cardNo, String expiry, String cvv) {
		System.out.println("Processing card payment of "+amount+ " usig cardNumber "+cardNo);
	}
}
