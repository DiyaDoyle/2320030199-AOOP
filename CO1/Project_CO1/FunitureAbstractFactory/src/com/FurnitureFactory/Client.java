package com.FurnitureFactory;

public class Client {
    private Chair chair;
    private Bed bed;
    private DiningTable table;
    
    public Client(FurnitureFactory furniture) {
    	chair = furniture.createChair();
    	bed = furniture.createBed();
    	table = furniture.createTable();
    }
    
    public void Furnish() {
    	chair.sitOn();
    	bed.lieOn();
    	table.eatOn();
    }


}
