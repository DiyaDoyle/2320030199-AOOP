package com.FurnitureFactory;

public class VictorianFurniture implements FurnitureFactory{

	@Override
	public Chair createChair() {
		// TODO Auto-generated method stub
		return new VictorianChair();
	}

	@Override
	public Bed createBed() {
		// TODO Auto-generated method stub
		return new VictorianBed();
	}

	@Override
	public DiningTable createTable() {
		// TODO Auto-generated method stub
		return new VictorianTable();
	}

}
