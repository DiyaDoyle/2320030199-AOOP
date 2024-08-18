package com.MusicStreamingApplication;

public class EqualizerDecorater extends DecoraterMusic{

	public EqualizerDecorater(MusicSource decoratedMusic) {
		super(decoratedMusic);
		// TODO Auto-generated constructor stub
	}

	public void play() {
		super.play();
		setEqualizer();
	}

	private void setEqualizer() {
		System.out.println("Setting Equalizer settings");
	}

}
