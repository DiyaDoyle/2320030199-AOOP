package com.AuctionSystem;

public class BidderImpl implements Bidder{
	 private String name;

	    public BidderImpl(String name) {
	        this.name = name;
	    }

	    @Override
	    public void update(String message) {
	        System.out.println("Bidder " + name + ": " + message);
	    }

}
