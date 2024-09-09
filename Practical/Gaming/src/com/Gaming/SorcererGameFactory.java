package com.Gaming;

public class SorcererGameFactory extends GameElementsFactory{

	@Override
	public Weapon createWeapons() {
		// TODO Auto-generated method stub
		return new Magic();
	}

	@Override
	public PowerUp createPowerUp() {
		// TODO Auto-generated method stub
		return new HealthBoost();
	}

}
