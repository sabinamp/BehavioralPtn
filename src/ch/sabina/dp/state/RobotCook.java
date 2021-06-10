package ch.sabina.dp.state;

// implements a behavior associated with a state of the Context.
public class RobotCook implements RoboticState{
	
	@Override
	public void doAction(Robot robot) {
		robot.setState(this);
		System.out.println("cooking");
	}
	public String toString() {
		return "RobotCook";
	}
	

}
