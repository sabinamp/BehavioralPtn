package ch.sabina.dp.state;

public class TestOrder {
	public static void testOrder() {
		Order ord1= new Order();
		ord1.getState().printStatus();
		ord1.nextState();
		ord1.getState().printStatus();
		ord1.nextState();
		ord1.getState().printStatus();
		ord1.nextState();
		ord1.getState().printStatus();
		ord1.prevState();
		ord1.getState().printStatus();
		
		
	}

}
