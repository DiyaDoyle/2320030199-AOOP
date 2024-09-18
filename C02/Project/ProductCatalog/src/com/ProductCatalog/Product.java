package com.ProductCatalog;
import java.util.*;

public class Product {
	private String id;
	private String name;
	private double price;
	private String category;
	
	public Product(String id, String name, double price, String category) {
		this.id= id;
		this.name= name;
		this.price= price;
		this.category= category;
	}
	
	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public String getCategory() {
		return category;
	}
	
	public boolean equals(Object o) {
		if(this ==o) {
			return true;
		}
		if(o==null || getClass() != o.getClass()) {
			return false;
		}
		Product product = (Product) o;
		return id.equals(product.id);
	}
	
	 public int hashCode() {
	        return Objects.hash(id);
	}
	 public String toString() {
	        return "Product{" +
	                "id='" + id + '\'' +
	                ", name='" + name + '\'' +
	                ", price=" + price +
	                ", category='" + category + '\'' +
	                '}';
	    }
}
