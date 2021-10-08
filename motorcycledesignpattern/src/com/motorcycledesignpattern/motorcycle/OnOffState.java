package com.motorcycledesignpattern.motorcycle;

public class OnOffState extends HeadLightState {

	OnOffState(MotorCycle bike) {
		super(bike);
		
	}

	@Override
	public void onState() {
		System.out.println("------------HeadLight is ON--------------");
		
	}

	@Override
	public void offState() {
		System.out.println("------------HeadLight is OFF--------------");
	}
	

	  
}
