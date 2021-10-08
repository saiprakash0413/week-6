package com.motorcycledesignpattern.motorcycle;

public class FirstGear extends GearState{
	
	FirstGear(MotorCycle cycle) {
	       super(cycle);
	   }

	   @Override
	   public void gearUp() {
	       System.out.println("Moving Up from FirstGear to SecondGear");
	       motorCycle.gearState =  new SecondGear(motorCycle);
	   }

	   @Override
	   public void gearDown() {
	       System.out.println("Already in the FirstGear - cannot go lower");
	   }

	@Override
	public void move() {
		System.out.println("MotorCycle has been Started");
		
	}
	
	

}
