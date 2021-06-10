package ch.sabina.dp.interpreter.nb;

public class Substract implements Expression {
	private final Expression leftExpr;
	private final Expression rightExpr;
	
	
	public Substract(Expression leftExpression,Expression rightExpression ){
		this.leftExpr = leftExpression;
		this.rightExpr = rightExpression;
	}
	@Override
	public int interpret() {

		return leftExpr.interpret() - rightExpr.interpret();
	}

}
