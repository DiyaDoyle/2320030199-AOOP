package com.ecommerce;

import java.util.*;

public class Order {
	private String orderId;
	private Customer customer;
	private List<OrderItem> items;
	private double totalAmount;
	private String orderDate;
	private String status;
	
	public Order(String orderId, Customer customer, List<OrderItem> items, double totalAmount, String orderDate, String status) {
		this.orderId= orderId;
		this.customer= customer;
		this.items= items;
		this.totalAmount= totalAmount;
		this.orderDate= orderDate;
		this.status= status;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId= orderId;
	}
	public Customer getCustomer() {
		return customer;
	}
	
	public void setCustomer(Customer customer) {
		this.customer= customer;
	}
	
	public List<OrderItem> getItems(){
		return items;
	}
	
	public void setItems(List<OrderItem> items) {
		this.items= items;
	}
	
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount= totalAmount;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate= orderDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status= status;
	}
	public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", customer=" + customer +
                ", items=" + items +
                ", totalAmount=" + totalAmount +
                ", orderDate='" + orderDate + '\'' +
                ", status='" + status + '\'' +
                '}';

	}
	
}
