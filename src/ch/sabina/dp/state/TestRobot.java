package ch.sabina.dp.state;

public class TestRobot {
	public void testRobot() {
		Robot rob= new Robot();
		RobotOn on = new RobotOn();
		on.doAction(rob);
		
		
		RobotCook cook = new RobotCook();
		cook.doAction(rob);
		
		RobotWalk walk = new RobotWalk();
		walk.doAction(rob);
		
		RobotOff off= new RobotOff();
		off.doAction(rob);
	}
	
}
