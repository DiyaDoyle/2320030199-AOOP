package com.ecommerce.handlers;

import com.ecommerce.Order;
import com.ecommerce.OrderHandler;

public class PaymentProcessingHandler implements OrderHandler{
	private OrderHandler nextHandler;
	@Override
	public void setnextHandler(OrderHandler nextHandler) {
		// TODO Auto-generated method stub
		this.nextHandler= nextHandler;
	}

	@Override
	public void processOrder(Order order) {
		// TODO Auto-generated method stub
		if(processPayment(order)) {
			System.out.println("Payment processed");
			if(nextHandler != null) {
				nextHandler.processOrder(order);
			}
			
		}
		else {
			System.out.println("Payment failed");
		}
		
	}
	
	private boolean processPayment(Order order) {
		return order !=null && order.getTotalAmount()>0;	
	}
	

}
