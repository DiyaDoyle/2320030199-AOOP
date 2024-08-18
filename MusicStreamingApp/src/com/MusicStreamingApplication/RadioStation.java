package com.MusicStreamingApplication;

public class RadioStation {
	private String stationName;

	public RadioStation(String name) {
		this.stationName= name;
	}

	public void play() {
		System.out.println("Playing radio station: "+stationName);
	}

	public void stopRadio() {
		System.out.println("Stopped Playing station: "+stationName);
	}

}
