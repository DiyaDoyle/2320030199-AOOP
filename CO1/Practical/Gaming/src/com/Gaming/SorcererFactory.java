package com.Gaming;

public class SorcererFactory extends EnemyFactory{

	@Override
	public Enemy createEnemy() {
		// TODO Auto-generated method stub
		return new Sorcerers();
	}

}