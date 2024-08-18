package com.AuctionSystem;

public abstract class AuctionTemplate {
	public final void conductAuction() {
        initializeAuction();
        startAuction();
        acceptBids();
        closeAuction();
    }

    protected abstract void initializeAuction();
    protected abstract void startAuction();
    protected abstract void acceptBids();
    protected abstract void closeAuction();

}
