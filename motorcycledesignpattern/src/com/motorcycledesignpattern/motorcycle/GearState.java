package com.motorcycledesignpattern.motorcycle;

 abstract class GearState {
	
	MotorCycle motorCycle;
	   GearState(MotorCycle bike){
	       this.motorCycle = bike;
	   }
	   public abstract void move();
	   public abstract void gearUp();
	   public abstract void gearDown();

}
