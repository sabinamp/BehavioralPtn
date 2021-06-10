package ch.sabina.dp.visitor;

public abstract class Element {
	protected String uuid;
	
	public abstract void accept(Visitor v);
}
