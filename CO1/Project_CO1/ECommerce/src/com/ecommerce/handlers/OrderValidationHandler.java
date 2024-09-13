package com.ecommerce.handlers;

import com.ecommerce.Order;
import com.ecommerce.OrderHandler;

public class OrderValidationHandler implements OrderHandler{
	private OrderHandler nextHandler;

	@Override
	public void setnextHandler(OrderHandler nextHandler) {
		// TODO Auto-generated method stub
		this.nextHandler= nextHandler;
		
	}

	@Override
	public void processOrder(Order order) {
		// TODO Auto-generated method stub
		if(validateOrder(order)) {
			System.out.println("Order Validated");
			if(nextHandler != null) {
				nextHandler.processOrder(order);
			}
		}
		else {
			System.out.println("Order validation failed");
		}
	} 
	
	private boolean validateOrder(Order order) {
		 return order!=null && order.getItems() !=null && !order.getItems().isEmpty();
	}

}
