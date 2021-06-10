package ch.sabina.dp.state;

// implements a behavior associated with a state of the Context.
public class RobotOff implements RoboticState{
	private final Robot robot;
	
	public RobotOff(Robot robot){
		this.robot = robot;
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cook() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void off() {
		// TODO Auto-generated method stub
		
	}

}
