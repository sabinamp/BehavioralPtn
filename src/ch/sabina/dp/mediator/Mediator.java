package ch.sabina.dp.mediator;

//Button, Fan, or PowerSupplier classes communicate directly. They only have a single reference to the Mediator.
//The Mediator Pattern is a good choice if we have to deal with a set of objects that are tightly coupled and hard to maintain.
//This way we can reduce the dependencies between objects and decrease the overall complexity.
public class Mediator {
	private Button button;
    private Fan fan;
    private PowerSupplier powerSupplier;

    // constructor, getters and setters

    public void press() {
        if (fan.isOn()) {
            fan.turnOff();
        } else {
            fan.turnOn();
        }
    }

    public void start() {
        powerSupplier.turnOn();
    }

    public void stop() {
        powerSupplier.turnOff();
    }
}
