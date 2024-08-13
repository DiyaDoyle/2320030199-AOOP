package com.PizzaStore;

public class PizzaTestDrive {
    public static void main(String[] args) {
    	PizzaStore nyStore = new NYPizzaStore();
    	PizzaStore chicagoStore= new ChicagoPizzaStore();
    	Pizza pizza = nyStore.orderPizza("Cheese");
    	System.out.println("Ethan orderd a "+pizza.getName());
    	pizza= chicagoStore.orderPizza("Cheese");
    	System.out.println("Joel ordered a "+pizza.getName());
    }
}
