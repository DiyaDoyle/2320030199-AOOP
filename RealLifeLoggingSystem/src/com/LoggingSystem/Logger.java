package com.LoggingSystem;

public class Logger {
   private static Logger Instance;
   private Logger() {}
   
   public static synchronized Logger getInstance() {
	if(Instance==null) {
		Instance= new Logger();
		return Instance;
	}
	else {
		return Instance;
	}
   }
   
   public void LogInfo(String message) {
	   System.out.println("INFO: "+message);
   }
   public void logWarning(String message) {
	   System.out.println("WARNING: "+message);
   }
   public void logError(String message) {
	   System.err.println("ERROR: "+message);
   }
   
}
