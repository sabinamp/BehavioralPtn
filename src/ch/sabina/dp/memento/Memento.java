package ch.sabina.dp.memento;

//Use the Memento Pattern in the following cases:
//• A snapshot of (some portion of) an object’s state must be saved so that it can be restored to that state later, and
//• A direct interface to obtaining the state would expose implementation details and break the object’s encapsulation.

//stores internal state of the Originator object.
// The memento may store as much or as little of the originator’s internal state as
//necessary at its originator’s discretion.
//doesn't have any setter methods it only servers to get data
public class Memento {
	private double x;
	private double y;
	
	public Memento(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	public double getX(){
		return x;
	}
	
	public double getY(){
		return y;
	}

}
