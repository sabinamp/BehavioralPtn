package ch.sabina.dp.state;

// implements a behavior associated with a state of the Context.
public class RobotWalk implements RoboticState{
	
	@Override
	public void doAction(Robot robot) {
		robot.setState(this);
		System.out.println("walking");
	}
	public String toString() {
		return "RobotWalk";
	}
	

}
