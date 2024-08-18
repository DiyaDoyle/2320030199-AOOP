package com.MusicStreamingApplication;

public class DecoraterMusic implements MusicSource{
	private MusicSource decoratedMusic;

	public DecoraterMusic(MusicSource decoratedMusic) {
		this.decoratedMusic= decoratedMusic;
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		decoratedMusic.play();

	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		decoratedMusic.stop();
	}

}
