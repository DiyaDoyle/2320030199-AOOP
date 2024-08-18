package com.AuctionSystem;

public class StandardAuction extends AuctionTemplate {
    private AuctionItem auctionItem;

    public StandardAuction(AuctionItem auctionItem) {
        this.auctionItem = auctionItem;
    }

    @Override
    protected void initializeAuction() {
        System.out.println("Initializing standard auction...");
    }

    @Override
    protected void startAuction() {
        auctionItem.startAuction();
    }

    @Override
    protected void acceptBids() {
        System.out.println("Accepting bids for standard auction...");
        auctionItem.newBid(100.0);
        auctionItem.newBid(150.0);
    }

    @Override
    protected void closeAuction() {
        auctionItem.closeAuction();
    }
}