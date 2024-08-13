package com.PizzaStore;

public class ChicagoPizzaStore extends PizzaStore{

	@Override
	protected Pizza createPizza(String type) {
		if(type.equals("Cheese")) {
			return new ChicagoStyleCheesePizza();
		}
		else {
			return null;
		}
	}

}