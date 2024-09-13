package com.ecommerce.factories;

import com.ecommerce.Products;

import com.ecommerce.product.clothing.Shirt;

import java.util.*;



public class clothingFactory {
	
	public static List<Products> getAvailableClothing(){
		List<Products> shirts= new ArrayList<>();
		shirts.add(new Shirt("M", "Black", 200));
		shirts.add(new Shirt("XS", "White", 300));
		shirts.add(new Shirt("XL", "Red", 250));
		return shirts;
		
	}

}
