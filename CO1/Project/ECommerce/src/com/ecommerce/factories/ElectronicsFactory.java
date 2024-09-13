package com.ecommerce.factories;

import com.ecommerce.Products;
import com.ecommerce.product.electronics.Laptop;

import java.util.*;

public class ElectronicsFactory {
	
	public static List<Products> getAvailableLaptops(){
		List<Products> laptops= new ArrayList<>();
		laptops.add(new Laptop("Dell XPS 15", 264090.01 ,12));
		laptops.add(new Laptop("MacBook Pro", 169900.00, 6));
		laptops.add(new Laptop("HP SpectreX360", 121499.00, 11));
		return laptops;
	}

}
