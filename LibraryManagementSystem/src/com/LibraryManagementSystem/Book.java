package com.LibraryManagementSystem;

class Book implements IItem, IBorrowable {
    private String title;
    private boolean available;

    public Book(String title) {
        this.title = title;
        this.available = true;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public boolean isAvailable() {
        return available;
    }

    @Override
    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public void borrow() {
        if (available) {
            setAvailable(false);
            System.out.println(title + " has been borrowed.");
        } else {
            System.out.println(title + " is not available.");
        }
    }

    @Override
    public void returnItem() {
        setAvailable(true);
        System.out.println(title + " has been returned.");
    }
}