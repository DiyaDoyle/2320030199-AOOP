package com.ContactManagementApp;

import java.util.HashMap;
import java.util.Map;

public class ContactManager {
   
    private Map<String, String> contacts;

    public ContactManager() {
        contacts = new HashMap<>();
    }

    public void addContact(String name, String phoneNumber) {
        contacts.put(name, phoneNumber);
        System.out.println("Contact added: " + name);
    }

    public void removeContact(String name) {
        if (contacts.containsKey(name)) {
            contacts.remove(name);
            System.out.println("Contact removed: " + name);
        } else {
            System.out.println("Contact not found: " + name);
        }
    }

    public String getPhoneNumber(String name) {
        if (contacts.containsKey(name)) {
            return contacts.get(name);
        } else {
            return "Contact not found: " + name;
        }
    }

    public void listAllContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts available.");
        } else {
            System.out.println("Contact List:");
            for (Map.Entry<String, String> entry : contacts.entrySet()) {
                System.out.println("Name: " + entry.getKey() + ", Phone Number: " + entry.getValue());
            }
        }
    }
}
