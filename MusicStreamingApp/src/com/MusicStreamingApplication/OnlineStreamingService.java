package com.MusicStreamingApplication;

public class OnlineStreamingService {
	private String url;

	public OnlineStreamingService(String url) {
		this.url= url;

	}
	 public void play() {
		 System.out.println("Playing from url: "+url);
	 }
	 public void stop() {
		 System.out.println("Stopped playing from url: "+url);
	 }


}