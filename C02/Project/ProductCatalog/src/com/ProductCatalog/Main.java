package com.ProductCatalog;
import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		CatgorizedProductCatalog categorizedCatalog= new CatgorizedProductCatalog();
		
		 while (true) {
	            System.out.println("\n--- Product Catalog Menu ---");
	            System.out.println("1. Display Products by Category");
	            System.out.println("2. Add Product");
	            System.out.println("3. Display All Products");
	            System.out.println("4. Exit");
	            System.out.print("Choose an option: ");
	            
	            int choice = sc.nextInt();
	            sc.nextLine();
	            switch(choice) {
	            case 1:
	            	addProduct(sc, categorizedCatalog);
	            	break;
	            case 2:
	            	displayProductsByCategory(sc, categorizedCatalog);
	            	break;
	            case 3:
	            	categorizedCatalog.displayAllProducts();
	            	break;
	            case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please choose again.");
            }
	      }
	   }

	private static void displayProductsByCategory(Scanner sc, CatgorizedProductCatalog catalog) {
		// TODO Auto-generated method stub
		System.out.print("Enter Product ID: ");
        String id = sc.nextLine();
        System.out.print("Enter Product Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Product Price: ");
        double price = sc.nextDouble();
        sc.nextLine(); // consume the newline character
        System.out.print("Enter Product Category: ");
        String category = sc.nextLine();

        Product product = new Product(id, name, price, category);
        catalog.addProduct(product);
		
	}

	private static void addProduct(Scanner sc, CatgorizedProductCatalog catalog) {
		// TODO Auto-generated method stub
		 System.out.print("Enter Category Name: ");
	     String category = sc.nextLine();
	     catalog.displayProductsByCategory(category);
		
	}
	
	
	}

	
