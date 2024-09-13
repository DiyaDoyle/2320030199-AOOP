package com.ecommerce.payment;

public class CardPaymentAdapter implements PaymentProcessor {
	 private CardPayment cardProcessor;

	    public CardPaymentAdapter(CardPayment cardProcessor) {
	        this.cardProcessor = cardProcessor;
	    }

	@Override
	 public void processPayment(double amount, String... details) {
        cardProcessor.cardPayment(amount, details[0], details[1], details[2]); 
    }
}
