package com.MusicStreamingApplication;

public class RadioStationAdapter implements MusicSource{
    private RadioStation radio;

    public RadioStationAdapter(RadioStation radio) {
    	this.radio= radio;
    }
	@Override
	public void play() {
		// TODO Auto-generated method stub
		radio.play();

	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		radio.stopRadio();
	}

}