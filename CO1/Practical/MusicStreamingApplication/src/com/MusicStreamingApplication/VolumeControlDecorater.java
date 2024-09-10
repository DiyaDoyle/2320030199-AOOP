package com.MusicStreamingApplication;

public class VolumeControlDecorater extends DecoraterMusic{

	public VolumeControlDecorater(MusicSource decoratedMusic) {
		super(decoratedMusic);
		// TODO Auto-generated constructor stub
	}

	public void play() {
		super.play();
		setVolume();
	}

	private void setVolume() {
		System.out.println("Setting Volume");
	}

}
