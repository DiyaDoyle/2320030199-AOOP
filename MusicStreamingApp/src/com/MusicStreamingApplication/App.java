package com.MusicStreamingApplication;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      MusicSource localFile= new LocalFileMusicSource("song.mp3");
      localFile = new EqualizerDecorater(localFile);
      localFile= new VolumeControlDecorater(localFile);
      localFile.play();
      localFile.stop();
      System.out.println();

      OnlineStreamingService streaming= new OnlineStreamingService("http://streaming-service.com/song");
      MusicSource onlinestream= new OnlineStreamingAdapter(streaming);
      onlinestream= new EqualizerDecorater(onlinestream);
      onlinestream= new VolumeControlDecorater(onlinestream);
      onlinestream.play();
      onlinestream.stop();
      System.out.println();

      RadioStation radioStation= new RadioStation("FM radio");
      MusicSource radio= new RadioStationAdapter(radioStation);
      radio= new EqualizerDecorater(radio);
      radio= new VolumeControlDecorater(radio);
      radio.play();
      radio.stop();


	}

}
