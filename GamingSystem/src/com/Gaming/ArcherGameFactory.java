package com.Gaming;

public class ArcherGameFactory extends GameElementsFactory{

	@Override
	public Weapon createWeapons() {
		// TODO Auto-generated method stub
		return new BowsAndArrows();
	}

	@Override
	public PowerUp createPowerUp() {
		// TODO Auto-generated method stub
		return new Armour();
	}

}