package com.AuctionSystem;

public class ReserveAuction extends AuctionTemplate{

	private AuctionItem auctionItem;
    private double reservePrice;

    public ReserveAuction(AuctionItem auctionItem, double reservePrice) {
        this.auctionItem = auctionItem;
        this.reservePrice = reservePrice;
    }

    @Override
    protected void initializeAuction() {
        System.out.println("Initializing reserve auction with reserve price $" + reservePrice);
    }

    @Override
    protected void startAuction() {
        auctionItem.startAuction();
    }

    @Override
    protected void acceptBids() {
        System.out.println("Accepting bids for reserve auction...");
        auctionItem.newBid(200.0);
        auctionItem.newBid(250.0);
    }

    @Override
    protected void closeAuction() {
        System.out.println("Reserve auction has ended.");
        // Logic to check if reserve price is met
        auctionItem.closeAuction();
    }

}
