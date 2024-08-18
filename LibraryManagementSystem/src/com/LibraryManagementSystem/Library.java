package com.LibraryManagementSystem;

import java.util.HashMap;
import java.util.Map;

class Library {
    private Map<String, Book> books = new HashMap<>();
    private Map<String, Member> members = new HashMap<>();

    public void addBook(Book book) {
        books.put(book.getTitle(), book);
    }

    public void addMember(Member member) {
        members.put(member.getName(), member);
    }

    public void borrowBook(String bookTitle, String memberName) {
        Book book = books.get(bookTitle);
        Member member = members.get(memberName);

        if (book != null && member != null) {
            book.borrow();
        } else {
            System.out.println("Book or Member not found.");
        }
    }

    public void returnBook(String bookTitle) {
        Book book = books.get(bookTitle);
        if (book != null) {
            book.returnItem();
        } else {
            System.out.println("Book not found.");
        }
    }
}
