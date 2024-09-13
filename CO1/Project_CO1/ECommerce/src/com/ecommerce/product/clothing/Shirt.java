package com.ecommerce.product.clothing;

import com.ecommerce.Products;

public class Shirt implements Products{
	private String size;
	private String color;
	private double price;
	private int stock;
	
	public Shirt(String size, String color, int stock) {
		this.color= color;
		this.stock= stock;
		this.size= size;
		setPrice();
	}

	@Override
	public boolean IsInStock() {
		// TODO Auto-generated method stub
		return stock>0;
	}

	@Override
	public void purchase() {
		// TODO Auto-generated method stub
		if(IsInStock()) {
			stock--;
			System.out.println("Purchased "+color+" shirt of size "+size+". Remaining stock is "+stock);
		}
		else {
			System.out.println("Sorry, Item is out of stock");
		}
		
	}

	@Override
	public void displayDetails() {
		// TODO Auto-generated method stub
		System.out.println("Item : Shirt");
		System.out.println("Color: "+color);
		System.out.println("Size: "+size);
		System.out.println("Price: "+price);
		
	}
	
	public void setPrice() {
		if(size.equalsIgnoreCase("XS") || size.equalsIgnoreCase("S")|| size.equalsIgnoreCase("M") || size.equalsIgnoreCase("L")) {
			this.price=100;
		}
		else {
			this.price= 150;
		}
		
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return price;
	}


}
