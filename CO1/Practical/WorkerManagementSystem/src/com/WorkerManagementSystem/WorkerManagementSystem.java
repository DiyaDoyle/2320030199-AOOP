package com.WorkerManagementSystem;

public class WorkerManagementSystem {
	 public static void main(String[] args) {
	        Worker robot = new Robot();
	        robot.work();  
	        
	        Worker humanWorker = new Human();
	        humanWorker.work();  
	        
	    
	        if (humanWorker instanceof Eater) {
	            Eater humanEater = (Eater) humanWorker;
	            humanEater.eat(); 
	        }
	    }

}
