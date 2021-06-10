package ch.sabina.dp.state;

//Defines an interface for encapsulating the behavior associated with a particular state of the Context.

public interface RoboticState {
	 void doAction(Robot robot);// walk();  cook();  off();

}
