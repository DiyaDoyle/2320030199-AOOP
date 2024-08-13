package com.PizzaStore;

public abstract class PizzaStore {
	public Pizza orderPizza(String type) {
		Pizza pizza = createPizza(type);

		if(pizza!= null) {
			pizza.prepare();
			pizza.bake();
			pizza.cut();
			pizza.box();
		}
		return pizza;
	}

	protected abstract Pizza createPizza(String type);




}
