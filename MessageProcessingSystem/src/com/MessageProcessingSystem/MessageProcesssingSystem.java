package com.MessageProcessingSystem;

public class MessageProcesssingSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MessageService emailService = new EmailService();
        MyApplication appWithEmail = new MyApplication(emailService);
        appWithEmail.processMessage("Hello via Email!");

        
        MessageService smsService = new SmsService();
        MyApplication appWithSMS = new MyApplication(smsService);
        appWithSMS.processMessage("Hello via SMS!");

	}

}
