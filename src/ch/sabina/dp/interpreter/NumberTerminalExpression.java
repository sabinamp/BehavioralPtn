package ch.sabina.dp.interpreter;

//maintains instance variables of type AbstractExpression for each of the symbols R1 through Rn.
// Implements an Interpret operation for non terminal symbols in the grammar. 
public class NumberTerminalExpression implements Expression{
	private final int n;
	
	public NumberTerminalExpression(int n){
		this.n = n;
	}
	
	@Override
	public int interpret() {
		return n;
	}

}
