package com.AuctionSystem;

import java.util.ArrayList;
import java.util.List;

public class AuctionItemImpl implements AuctionItem{
	private List<Bidder> bidders = new ArrayList<>();
    private String itemName;
    private double currentBid;

    public AuctionItemImpl(String itemName) {
        this.itemName = itemName;
    }

    public void registerBidder(Bidder bidder) {
        bidders.add(bidder);
    }

    @Override
    public void removeBidder(Bidder bidder) {
        bidders.remove(bidder);
    }

    @Override
    public void notifyBidders(String message) {
        for (Bidder bidder : bidders) {
            bidder.update(message);
        }
    }

    public void newBid(double bidAmount) {
        this.currentBid = bidAmount;
        notifyBidders("New bid placed: $" + bidAmount + " on " + itemName);
    }

    public void startAuction() {
        notifyBidders("Auction for " + itemName + " has started!");
    }

    public void closeAuction() {
        notifyBidders("Auction for " + itemName + " has ended. Winning bid: $" + currentBid);
    }

}
