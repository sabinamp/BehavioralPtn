package ch.sabina.dp.state;

public class PlacedOrderState implements OrderState {

	@Override
	public void next(Order order) {
		order.setState(new DeliveredOrderState());

	}

	@Override
	public void prev(Order order) {
		 System.out.println("The order is in its root state.");

	}

	@Override
	public void printStatus() {
		System.out.println("Placed Order");

	}

}
