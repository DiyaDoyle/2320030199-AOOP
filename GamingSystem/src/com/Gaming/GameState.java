package com.Gaming;

public class GameState {
	private static GameState instance;
	private int currentLevel;
	private int score;
	private GameState(){
		currentLevel= 1;
		score=0;
	}

	public static synchronized GameState getInstance() {
		if(instance==null) {
			instance= new GameState();
		}
		return instance;

	}
    public int getCurrentLevevl() {
    	return currentLevel;
    }

    public void increaseLevel() {
    	currentLevel++;
    }
    public int getScore() {
    	return score;
    }
    public void addScore(int points) {
    	score+= points;
    }
}
