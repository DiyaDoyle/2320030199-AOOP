package com.ecommerce.payment;

public interface PaymentProcessor {
	void processPayment(double amount, String... details);

}
