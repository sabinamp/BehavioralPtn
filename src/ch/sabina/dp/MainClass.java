package ch.sabina.dp;

import ch.sabina.dp.chainofresponsibility.TestChainofResponsibility;
import ch.sabina.dp.command.TestCommand;
import ch.sabina.dp.interpreter.TestInterpreter;
import ch.sabina.dp.state.TestOrder;
import ch.sabina.dp.state.TestRobot;
import ch.sabina.dp.strategy.TestStrategy;
import ch.sabina.dp.template.TestTemplate;

public class MainClass {
	public static void main(String[] args) {
		//new TestCommand().testCommand();
		//new TestChainofResponsibility().chain();
		//new TestStrategy().testStrategy();
		//new TestRobot().testRobot();
		//new TestOrder().testOrder();
		//new TestTemplate().testTemplate();
		new TestInterpreter().testInterpreter();
	}
}
