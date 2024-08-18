package com.Gaming;

public class DragonFactory extends EnemyFactory{

	@Override
	public Enemy createEnemy() {
		// TODO Auto-generated method stub
		return new Dragons();
	}

}