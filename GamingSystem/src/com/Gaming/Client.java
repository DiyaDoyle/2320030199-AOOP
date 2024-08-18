package com.Gaming;

public class Client {
	public static void main(String args[]) {
		GameState gamestate= GameState.getInstance();

		System.out.println("Playing level "+gamestate.getCurrentLevevl());

		EnemyFactory archersFactory= new ArchersFactory();
		GameElementsFactory archerGameElementFactory= new ArcherGameFactory();
		Enemy archer= archersFactory.createEnemy();
		Weapon bowsAndArrows= archerGameElementFactory.createWeapons();
		PowerUp armour= archerGameElementFactory.createPowerUp();
		archer.attack();
	    bowsAndArrows.use();
	    armour.activate();

	    gamestate.addScore(100);
        System.out.println("Current score: " + gamestate.getScore());
        gamestate.increaseLevel();

        System.out.println("Playing level "+gamestate.getCurrentLevevl());

       EnemyFactory sorcerersFactory= new SorcererFactory();
       GameElementsFactory sorcererGameElementFactory= new SorcererGameFactory();
       Enemy sorcerer= sorcerersFactory.createEnemy();
       Weapon magic= sorcererGameElementFactory.createWeapons();
       PowerUp healthBoost= sorcererGameElementFactory.createPowerUp();
       sorcerer.attack();
       magic.use();
       healthBoost.activate();

       gamestate.addScore(100);
       System.out.println("Current score: " + gamestate.getScore());
       gamestate.increaseLevel();

       System.out.println("Playing level "+gamestate.getCurrentLevevl());

       EnemyFactory dragonsFactory= new DragonFactory();
       GameElementsFactory dragonsGameElementFactory= new DragonGameFactory();
       Enemy dragon= dragonsFactory.createEnemy();
       Weapon fire= dragonsGameElementFactory.createWeapons();
       PowerUp speedIncrease= dragonsGameElementFactory.createPowerUp(); 
       dragon.attack();
       fire.use();
       speedIncrease.activate();

       gamestate.addScore(100);
       System.out.println("Current score: " + gamestate.getScore());

	}


}