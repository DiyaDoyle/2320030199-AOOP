package com.ecommerce.decoraters;

import com.ecommerce.Products;

public class GiftWrapping extends ProductDecorater{
	private double wrappingCost=10.0;

	public GiftWrapping(Products decor, double wrappingCost) {
		super(decor);
		this.wrappingCost= wrappingCost;
	}
	
	public double getPrice() {
		return productsDecorater.getPrice()+ wrappingCost;
	}
	
	public void displayDetails() {
		productsDecorater.displayDetails();
		System.out.println("Wrapping cose: "+wrappingCost);
	}

}
