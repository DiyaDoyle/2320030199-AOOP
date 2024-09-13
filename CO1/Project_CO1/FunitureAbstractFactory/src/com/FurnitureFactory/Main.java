package com.FurnitureFactory;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FurnitureFactory victorianFurniture= new VictorianFurniture();
		Client VictorianFurnish= new Client(victorianFurniture);
		VictorianFurnish.Furnish();
		
		FurnitureFactory rusticFurniture= new RusticFurniture();
		Client rusticFurnish= new Client(rusticFurniture);
		rusticFurnish.Furnish();

	}

}
