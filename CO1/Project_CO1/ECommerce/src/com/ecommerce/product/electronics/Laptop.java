package com.ecommerce.product.electronics;

import com.ecommerce.Products;

public class Laptop implements Products{

	private String model;
	private double price;
	private int stock;
	
	public Laptop(String model, double price, int Stock) {
		this.model= model;
		this.price= price;
		this.stock= Stock;
	}
	
	@Override
	public boolean IsInStock() {
		// TODO Auto-generated method stub
		return stock > 0;
	}
	
	

	@Override
	public void purchase() {
		
		// TODO Auto-generated method stub
		if(IsInStock()) {
			stock--;
			System.out.println("Purchased "+model+". Stock remaining "+stock);
		}
		else {
			System.out.println("Sorry, "+model+" is out of stock");
		}
		
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return price;
		
	}



	@Override
	public void displayDetails() {
		System.out.println("Laptop Model: "+model);
		System.out.println("Price: $" +price);
		System.out.println("In stock: "+stock);
		
	}

}
