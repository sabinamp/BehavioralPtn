package ch.sabina.dp.state;

public class Robot implements RoboticState{
	
	private RoboticState roboticOn;
	private RoboticState roboticCook;
	private RoboticState roboticOff;
	private RoboticState state; 
	//default is on
	
	public Robot() {
		this.roboticCook = new RobotCook(this);
		this.roboticOff = new RobotOff(this);
		this.roboticOn = new RobotOn(this);
		this.state= roboticOn;
		
	}

	@Override
	public void walk() {
		this.state.walk();
		
	}

	@Override
	public void cook() {
		this.state.cook();
		
	}

	@Override
	public void off() {
		this.state.off();
		
	}
	
	public RoboticState getState() {
		return state;
	}
	
	public void setState(RoboticState state) {
		this.state = state;
	}


}
