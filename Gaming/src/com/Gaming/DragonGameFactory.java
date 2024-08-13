package com.Gaming;

public class DragonGameFactory extends GameElementsFactory{

	@Override
	public Weapon createWeapons() {
		// TODO Auto-generated method stub
		return new Fire();
	}

	@Override
	public PowerUp createPowerUp() {
		// TODO Auto-generated method stub
		return new SpeedIncrease();
	}

}
