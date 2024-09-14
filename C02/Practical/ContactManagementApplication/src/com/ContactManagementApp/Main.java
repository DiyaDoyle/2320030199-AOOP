package com.ContactManagementApp;

public class Main {
	public static void main(String args[]) {
		ContactManager contactManager= new ContactManager();
		
		contactManager.addContact("Alice","123-456-7890");
		contactManager.addContact("Bob", "987-654-3210");
		
		 System.out.println("\nPhone Number for Alice: " + contactManager.getPhoneNumber("Alice"));
	     System.out.println("Phone Number for Bob: " + contactManager.getPhoneNumber("Bob"));
	     
	     contactManager.removeContact("Bob");

	     System.out.println("\nTrying to retrieve phone number for Bob: " + contactManager.getPhoneNumber("Bob"));
	     
	     System.out.println("\nListing all contacts:");
	        contactManager.listAllContacts();
	}

}
