package com.motorcycledesignpattern.motorcycle;

public class ThirdGear extends GearState {
	public ThirdGear(MotorCycle cycle) {
	       super(cycle);
	   }

	   @Override
	   public void gearUp() {
	       System.out.println("Already in the ThirdGear - cannot go higher");
	   }

	   @Override
	   public void gearDown() {
	       System.out.println("Moving Down from ThirdGear to SecondGear");
	       motorCycle.gearState =  new SecondGear(motorCycle);
	   }

	@Override
	public void move() {
		System.out.println("MotorCycle has been Started");
		
	}

}
