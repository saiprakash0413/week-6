package com.motorcycledesignpattern.motorcycle;

abstract class HeadLightState {
	
	MotorCycle motorCycle;
	HeadLightState(MotorCycle bike){
	       this.motorCycle = bike;
	   }
	   public abstract void onState();
	   public abstract void offState();
}
