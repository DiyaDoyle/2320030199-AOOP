package com.MusicStreamingApplication;

public class LocalFileMusicSource implements MusicSource
{
	private String filePath;

	public LocalFileMusicSource(String filepath){
		this.filePath= filepath;

	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Playing local File: "+filePath);
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Stoping local File: "+filePath);

	}

}
