package com.ProductCatalog;
import java.util.*;

public class CatgorizedProductCatalog {
	private Map<String, Set<Product>> categorizedProducts;
	
	public CatgorizedProductCatalog() {
		this.categorizedProducts= new HashMap<>();
	}
	
	public void addProduct(Product product) {
		categorizedProducts.putIfAbsent(product.getCategory(), new HashSet<>());
		categorizedProducts.get(product.getCategory()).add(product);
		System.out.println("Product added to category: "+product.getCategory());
	}
	
	public void displayProductsByCategory(String category) {
		Set<Product> products = categorizedProducts.get(category);
		if(products==null || products.isEmpty()) {
			System.out.println("No products found in category: "+category);
		}
		else {
			System.out.println("Products in catgory '"+category+"':");
			for(Product product : products) {
				System.out.println(product);
			}
		}
	}
	public void displayAllProducts() {
        if (categorizedProducts.isEmpty()) {
            System.out.println("No products in the catalog.");
        } else {
            for (Map.Entry<String, Set<Product>> entry : categorizedProducts.entrySet()) {
                System.out.println("Category: " + entry.getKey());
                for (Product product : entry.getValue()) {
                    System.out.println(product);
                }
            }
        }
    }

}
