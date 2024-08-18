package com.AuctionSystem;

public class AuctionClient {
	public static void main(String[] args) {
       
        AuctionItem auctionItem = new AuctionItemImpl("Antique Vase");

        
        Bidder bidder1 = new BidderImpl("Alice");
        Bidder bidder2 = new BidderImpl("Bob");
        auctionItem.registerBidder(bidder1);
        auctionItem.registerBidder(bidder2);

        
        AuctionTemplate standardAuction = new StandardAuction(auctionItem);
        standardAuction.conductAuction();

        
        AuctionTemplate reserveAuction = new ReserveAuction(auctionItem, 200.0);
        reserveAuction.conductAuction();
    }

}
