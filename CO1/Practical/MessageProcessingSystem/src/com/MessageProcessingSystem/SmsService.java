package com.MessageProcessingSystem;

public class SmsService implements MessageService{

	@Override
	public void sendMessage(String message) {
		// TODO Auto-generated method stub
		System.out.println("Sending SMS: "+message);
	}

}
