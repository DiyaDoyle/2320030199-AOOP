package com.FurnitureFactory;

public class RusticFurniture implements FurnitureFactory{

	@Override
	public Chair createChair() {
		// TODO Auto-generated method stub
		return new RusticChair();
	}

	@Override
	public Bed createBed() {
		// TODO Auto-generated method stub
		return new RusticBed();
	}

	@Override
	public DiningTable createTable() {
		// TODO Auto-generated method stub
		return new RusticTable();
	}

}
