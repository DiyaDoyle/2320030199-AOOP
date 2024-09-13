package com.ecommerce.decoraters;

import com.ecommerce.Products;

public class ApplyDiscount extends ProductDecorater{
	private double discountAmount;

	public ApplyDiscount(Products decor, double discountAmount) {
		super(decor);
		this.discountAmount= discountAmount;
	}
	
	public double getPrice() {
		return productsDecorater.getPrice()+discountAmount;
	}

	public void displayDetails() {
		productsDecorater.displayDetails();
		System.out.println("Discount Amount:"+discountAmount);
	}
}
