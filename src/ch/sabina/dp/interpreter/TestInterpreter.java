package ch.sabina.dp.interpreter;

import java.util.Stack;

public class TestInterpreter {
	public void testInterpreter() {
		String tokenString = "7 3 - 2 1 + +";
		Stack<Expression> stack = new Stack<>();
		String[] tokenArray = tokenString.split(" ");
		
		for(String each: tokenArray) {
			if(ExpressionUtils.isOperator(each)) {
				Expression right = stack.pop();
				Expression left = stack.pop();
				int current= ExpressionUtils.getOperator(each, left, right).interpret();
				stack.push(new NumberTerminalExpression(current));
			}
			else {
				Expression i = new NumberTerminalExpression(Integer.parseInt(each));
				stack.push(i);
			}
		}
		System.out.println("( "+tokenString+" ): interpreted as "+stack.pop().interpret());
		
	}
	
}
