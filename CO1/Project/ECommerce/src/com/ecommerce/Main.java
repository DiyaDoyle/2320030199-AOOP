package com.ecommerce;

import com.ecommerce.factories.clothingFactory;
import com.ecommerce.factories.ElectronicsFactory;
import com.ecommerce.handlers.OrderValidationHandler;
import com.ecommerce.handlers.PaymentProcessingHandler;
import com.ecommerce.handlers.InventoryUpdateHandler;
import com.ecommerce.payment.CardPayment;
import com.ecommerce.payment.CardPaymentAdapter;
import com.ecommerce.payment.PaymentProcessor;
import com.ecommerce.payment.UpiPaymentProcessor;
import com.ecommerce.payment.UpiPaymentAdapter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserLogin login = UserLogin.getInstance();
        
        System.out.println("Please login to continue.");
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        
       
        login.Login();

        if (login.isLoggedIn()) {
           
            System.out.println("Available products:");
            List<Products> products = new ArrayList<>();
            products.addAll(clothingFactory.getAvailableClothing());
            products.addAll(ElectronicsFactory.getAvailableLaptops());

            for (int i = 0; i < products.size(); i++) {
                Products product = products.get(i);
                System.out.print((i + 1) + ". ");
                product.displayDetails();
                System.out.println(); 
            }

           
            System.out.print("Enter the number of the product you want to select: ");
            int productIndex = scanner.nextInt();
            Products selectedProduct = products.get(productIndex - 1);

            System.out.print("Enter quantity: ");
            int quantity = scanner.nextInt();

            
            OrderItem orderItem = new OrderItem(selectedProduct, quantity);
            List<OrderItem> orderItems = new ArrayList<>();
            orderItems.add(orderItem);

          
            scanner.nextLine(); 
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();
            System.out.print("Enter your address: ");
            String address = scanner.nextLine();
            System.out.print("Enter your contact: ");
            String contact = scanner.nextLine();
            Customer customer = new Customer(name, address, contact);

            // Create order
            double totalAmount = selectedProduct.getPrice() * quantity;
            Order order = new Order("ORD001", customer, orderItems, totalAmount, "2024-08-18", "Processing");

            // Decorators
            System.out.print("Do you want to apply a discount? (yes/no): ");
            String applyDiscount = scanner.nextLine();
            if (applyDiscount.equalsIgnoreCase("yes")) {
                System.out.print("Enter discount amount: ");
                double discountAmount = scanner.nextDouble();
                scanner.nextLine();
                orderItem = new OrderItem(new com.ecommerce.decoraters.ApplyDiscount(selectedProduct, discountAmount), quantity);
                orderItems.clear();
                orderItems.add(orderItem);
            }

            System.out.print("Do you want gift wrapping? (yes/no): ");
            String giftWrapping = scanner.nextLine();
            if (giftWrapping.equalsIgnoreCase("yes")) {
                System.out.print("Enter wrapping cost: ");
                double wrappingCost = scanner.nextDouble();
                scanner.nextLine(); // Consume newline left-over
                orderItem = new OrderItem(new com.ecommerce.decoraters.GiftWrapping(selectedProduct, wrappingCost), quantity);
                orderItems.clear();
                orderItems.add(orderItem);
            }

            
            order = new Order("ORD001", customer, orderItems, totalAmount, "2024-08-18", "Processing");

           
            System.out.println("Select payment method:");
            System.out.println("1. Card Payment");
            System.out.println("2. UPI Payment");
            System.out.print("Enter your choice (1 or 2): ");
            int paymentChoice = scanner.nextInt();
            scanner.nextLine();
            
            PaymentProcessor paymentProcessor = null;
            if (paymentChoice == 1) {
               
                System.out.print("Enter card number: ");
                String cardNo = scanner.nextLine();
                System.out.print("Enter card expiry date (MM/YY): ");
                String expiry = scanner.nextLine();
                System.out.print("Enter card CVV: ");
                String cvv = scanner.nextLine();
                
                CardPayment cardPayment = new CardPayment();
                paymentProcessor = new CardPaymentAdapter(cardPayment);
                paymentProcessor.processPayment(totalAmount, cardNo, expiry, cvv);
            } else if (paymentChoice == 2) {
               
                System.out.print("Enter UPI ID: ");
                String upiId = scanner.nextLine();
                
                UpiPaymentProcessor upiPaymentProcessor = new UpiPaymentProcessor();
                paymentProcessor = new UpiPaymentAdapter(upiPaymentProcessor);
                paymentProcessor.processPayment(totalAmount, upiId);
            } else {
                System.out.println("Invalid choice. Payment not processed.");
                return;
            }

            OrderValidationHandler validationHandler = new OrderValidationHandler();
            PaymentProcessingHandler paymentHandler = new PaymentProcessingHandler();
            InventoryUpdateHandler inventoryHandler = new InventoryUpdateHandler();

            validationHandler.setnextHandler(paymentHandler);
            paymentHandler.setnextHandler(inventoryHandler);


            validationHandler.processOrder(order);

            System.out.println("Order Details:");
            for (OrderItem item : orderItems) {
                System.out.print("- ");
                item.getProduct().displayDetails();
                System.out.println(" x" + item.getQuantity());
            }
            System.out.println("Total Amount: $" + order.getTotalAmount());
        } else {
            System.out.println("Login failed.");
        }
        
        scanner.close();
    }
}