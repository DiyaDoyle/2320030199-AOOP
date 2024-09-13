package com.ecommerce;

public class OrderItem {
	private Products product;
	private int quantity;
	
	public OrderItem(Products product, int quantity) {
		this.product= product;
		this.quantity= quantity;
	}
	public Products getProduct() { 
		return product; 
		}
	
    public void setProduct(Products product) { 
    	this.product = product; 
    	}
    public int getQuantity() { 
    	return quantity; 
    	}
    public void setQuantity(int quantity) { 
    	this.quantity = quantity; 
    	}

    public double getTotalPrice() {
        return product.getPrice() * quantity;
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "product=" + product +
                ", quantity=" + quantity +
                '}';
    }
}
