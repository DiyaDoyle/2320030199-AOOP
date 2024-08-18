package com.LoggingSystem;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger logger= Logger.getInstance();
		Logger logger1= Logger.getInstance();
		System.out.println(logger1==logger);
		logger.LogInfo("This is an info mrssage");
		logger.logWarning("This is a warning message");
		logger.logError("This is an error message");
		

	}

}
