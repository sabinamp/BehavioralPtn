package ch.sabina.dp.state;

public class Robot{
	

	private RoboticState state; 
	//default is on
	
	public Robot() {				
		
	}

	
	public RoboticState getState() {
		return state;
	}
	
	public void setState(RoboticState state) {
		this.state = state;
	}


}
