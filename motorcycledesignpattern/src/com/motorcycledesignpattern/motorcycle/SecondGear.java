package com.motorcycledesignpattern.motorcycle;

public class SecondGear extends GearState {
	
	SecondGear(MotorCycle cycle) {
	       super(cycle);
	   }

	   @Override
	   public void gearUp() {
	       System.out.println("Moving Up  from SecondGear to ThirdGear");
	       motorCycle.gearState =  new ThirdGear(motorCycle);

	   }

	   @Override
	   public void gearDown() {
	       System.out.println("Moving Down from SecondGear to FirstGear");
	       motorCycle.gearState =  new FirstGear(motorCycle);
	   }

	@Override
	public void move() {
		System.out.println("MotorCycle has been Started");
		
	}

}
