package com.ProductCatalog;
import java.util.*;

public class ProductCatalog {
	private Set<Product> products;
	
	public ProductCatalog() {
		this.products= new HashSet<>();
	}
	
	public void addProduct(Product product) {
		if(products.add(product)) {
			System.out.println("Product added: "+product.getName());
		}
		else {
			System.out.println("Product already exists: "+product.getName());
		}
	}
	public void displayAllProducts() {
        if (products.isEmpty()) {
            System.out.println("No products in catalog.");
        } else {
            System.out.println("Product Catalog:");
            for (Product product : products) {
                System.out.println(product);
            }
        }
    }

}
