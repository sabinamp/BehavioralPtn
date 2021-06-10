package ch.sabina.dp.state;

// implements a behavior associated with a state of the Context.
public class RobotOn implements RoboticState{
	
	
	

	@Override
	public void doAction(Robot robot) {
		robot.setState(this);
		System.out.println("on");
	}

	public String toString() {
		return "RobotOn";
	}

}
