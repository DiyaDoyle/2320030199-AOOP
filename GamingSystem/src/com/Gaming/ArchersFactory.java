package com.Gaming;

public class ArchersFactory extends EnemyFactory{

	@Override
	public Enemy createEnemy() {
		// TODO Auto-generated method stub
		return new Archers();
	}

}
