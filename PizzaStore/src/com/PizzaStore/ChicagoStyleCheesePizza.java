package com.PizzaStore;

public class ChicagoStyleCheesePizza extends Pizza{
    public ChicagoStyleCheesePizza() {
    	name= "Chicago Style Deep Dish Cheese Pizza";
    	dough= "Extra Thick crust Dough";
    	sauce= "Plum Tomato Sauce";
    	toppings.add("Shredded Mozzarella Cheese");
    }

    public void cut() {
    	System.out.println("Cutting the pizza into square slices");
    }

}
