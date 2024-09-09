package com.ecommerce.handlers;

import com.ecommerce.Order;
import com.ecommerce.OrderHandler;

public class InventoryUpdateHandler implements OrderHandler {
	private OrderHandler nextHandler;
	@Override
	public void setnextHandler(OrderHandler nextHandler) {
		// TODO Auto-generated method stub
		this.nextHandler = nextHandler;
		
	}
	
	@Override
	public void processOrder(Order order) {
		// TODO Auto-generated method stub
		updateInventory(order);
		System.out.println("Inventory updated");
	}
	
	private void updateInventory(Order order) {
		System.out.println("inventory updated for order");
	}
}
