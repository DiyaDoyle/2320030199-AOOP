package com.ecommerce;

public interface OrderHandler {
	void setnextHandler(OrderHandler nextHandler);
	void processOrder(Order order);

}
