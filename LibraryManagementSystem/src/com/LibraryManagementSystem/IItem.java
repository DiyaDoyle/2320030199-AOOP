package com.LibraryManagementSystem;

public interface IItem {
	String getTitle();
    boolean isAvailable();
    void setAvailable(boolean available);

}
