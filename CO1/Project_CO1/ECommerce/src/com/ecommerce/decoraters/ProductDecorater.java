package com.ecommerce.decoraters;

import com.ecommerce.Products;

public abstract class ProductDecorater implements Products{
	protected Products productsDecorater;
	
	public ProductDecorater(Products decor) {
		this.productsDecorater= decor;
	}

	@Override
	public boolean IsInStock() {
		// TODO Auto-generated method stub
		return productsDecorater.IsInStock();
	}

	@Override
	public void purchase() {
		// TODO Auto-generated method stub
		productsDecorater.purchase();
	}

	@Override
	public void displayDetails() {
		// TODO Auto-generated method stub
		productsDecorater.displayDetails();
		
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return productsDecorater.getPrice();
	}

}
