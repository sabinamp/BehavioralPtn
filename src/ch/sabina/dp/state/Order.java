package ch.sabina.dp.state;

//has 3 states placed, delivered, received
public class Order{
	private OrderState state;
	
	public Order() {
		//default is placed
		this.state= new PlacedOrderState();
		
	}
	
	OrderState getState() {
		return state;
	}

	void setState(OrderState state) {
		this.state = state;
	}


	public void nextState() {
		 this.getState().next(this);		
		
	}

	
	public void prevState() {
		this.getState().prev(this);
		
	}

	
	public void printStatus() {
		this.getState().printStatus();
		
	}


}
