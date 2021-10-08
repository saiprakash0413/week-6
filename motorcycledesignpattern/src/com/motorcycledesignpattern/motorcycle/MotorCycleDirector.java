package com.motorcycledesignpattern.motorcycle;

public class MotorCycleDirector {
	
	 BuilderInterface myBuilder;

	    public void MotorCycleDirector(BuilderInterface builder) {
	        myBuilder = builder;
	        myBuilder.buildBody();
	        myBuilder.insertWheels();
	        myBuilder.addHeadlights();
	        myBuilder.handles();
	    }

}
