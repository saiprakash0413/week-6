package com.motorcycledesignpattern.motorcycle;

public class MotorCycle implements BuilderInterface {
	
	GearState gearState;
	HeadLightState lightState;

	   public MotorCycle(){
	       gearState = new FirstGear(this);
	       lightState=new OnOffState(this);
	   }
       public void move() {
    	   gearState.move();
       }
	   public void gearUp(){
	       gearState.gearUp();
	   }

	   public void gearDown(){
	       gearState.gearDown();
	   }
	   public void on() {
		   lightState.onState();
	   }
	   public void off() {
		   lightState.offState();
	   }
	   
	   @Override
	    public void buildBody() {
	        System.out.println("This is a body of a motorcycle");
	    }

	    @Override
	    public void insertWheels() {
	    	System.out.println("2 wheels are added");
	    }

	    @Override
	    public void addHeadlights() {
	    	System.out.println("1 headlight has been added");
	    }
		@Override
		public void handles() {
			System.out.println("Handles has been added");
			
		}

	    
	  
}
