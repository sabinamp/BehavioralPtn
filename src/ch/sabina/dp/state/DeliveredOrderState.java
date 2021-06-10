package ch.sabina.dp.state;

public class DeliveredOrderState implements OrderState {

	@Override
	public void next(Order order) {
		order.setState(new ReceivedOrderState());
	}

	@Override
	public void prev(Order order) {
		order.setState(new PlacedOrderState());

	}

	@Override
	public void printStatus() {
		System.out.println("Delivered Order");

	}

}
