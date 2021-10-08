package com.motorcycledesignpattern.motorcycle;


public class Client {
	public static void main(String[] args) {
	       MotorCycle motorCycle = new MotorCycle();
	     
	           
	           MotorCycleDirector director = new MotorCycleDirector();

	           BuilderInterface motorBuilder = new MotorCycle();
	           
	          
	           director.MotorCycleDirector(motorBuilder);
	           System.out.println("********************************************");
	           System.out.println("Motor Cycle Manufactured Successfully");
	           System.out.println("**********************************************");

	           motorCycle.move();
	           motorCycle.on();
	           motorCycle.gearDown();
	           motorCycle.gearUp();
	           motorCycle.gearUp();
	           motorCycle.gearUp();
	           motorCycle.gearDown();
	           motorCycle.gearDown();
	           motorCycle.off();
	           motorCycle.gearDown(); 
	          
	   }
}
