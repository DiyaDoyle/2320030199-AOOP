package com.ecommerce;

public class Customer {
	private String name;
	private String address;
	private String contact;
	
	public Customer(String name, String address, String contact) {
		this.name= name;
		this.address= address;
		this.contact= contact;
	}
	
	public String getname() {
		return name;
	}
	
	public void setName(String name) {
		this.name= name;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address= address;
	}
	
	public String getContact(){
		return contact;
	}
	public void setContact(String contact) {
	this.contact= contact;
	}
	
	public String toString() {
		return "Customer{"
				+ "name: "+name+"\nAddress: "+address+"\nContact: "+contact+"\n }";
					
	}

}
