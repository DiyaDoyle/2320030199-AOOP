package com.MusicStreamingApplication;

public class OnlineStreamingAdapter implements MusicSource{
	private OnlineStreamingService stream;

	public OnlineStreamingAdapter(OnlineStreamingService stream) {
		this.stream= stream;
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
      stream.play();
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		stream.stop();
	}

}
