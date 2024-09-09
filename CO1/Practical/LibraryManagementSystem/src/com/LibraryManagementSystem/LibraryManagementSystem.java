package com.LibraryManagementSystem;

public class LibraryManagementSystem {

	public static void main(String[] args) {
		 Library library = new Library();

	        Book book1 = new Book("Effective Java");
	        Book book2 = new Book("Design Patterns");
	        
	        library.addBook(book1);
	        library.addBook(book2);

	        Member member1 = new Member("Alice");
	        Member member2 = new Member("Bob");

	        library.addMember(member1);
	        library.addMember(member2);

	        library.borrowBook("Effective Java", "Alice"); 
	        library.borrowBook("Design Patterns", "Bob"); 
	        library.borrowBook("Effective Java", "Bob"); 

	        library.returnBook("Effective Java"); 
	        library.borrowBook("Effective Java", "Bob"); 

	}

}
