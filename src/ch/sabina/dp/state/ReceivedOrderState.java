package ch.sabina.dp.state;

public class ReceivedOrderState implements OrderState {

	@Override
	public void next(Order order) {
		System.out.println("This order has already been received by a client.");

	}

	@Override
	public void prev(Order order) {
		order.setState(new DeliveredOrderState());

	}

	@Override
	public void printStatus() {
		System.out.println("Received Order");

	}

}
