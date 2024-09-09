package com.AuctionSystem;

public interface AuctionItem {
	void registerBidder(Bidder bidder);
    void removeBidder(Bidder bidder);
    void notifyBidders(String message);
	void startAuction();
	void closeAuction();
	void newBid(double d);

}
