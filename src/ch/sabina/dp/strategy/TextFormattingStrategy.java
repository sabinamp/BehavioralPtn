package ch.sabina.dp.strategy;

//the Strategy Design Pattern defines a family of algorithms, encapsulating each one, and making them interchangeable
/*
 * public interface StrategyI {
 * 
 * }
 */
public interface TextFormattingStrategy {
	public void format(String text);
}