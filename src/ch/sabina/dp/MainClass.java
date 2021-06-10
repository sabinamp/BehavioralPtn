package ch.sabina.dp;

import ch.sabina.dp.chainofresponsibility.TestChainofResponsibility;
import ch.sabina.dp.command.TestCommand;
import ch.sabina.dp.interpreter.nb.TestInterpreter;
import ch.sabina.dp.iterator.TestIterator;
import ch.sabina.dp.memento.TestMemento;
import ch.sabina.dp.state.TestOrder;
import ch.sabina.dp.state.TestRobot;
import ch.sabina.dp.strategy.TestStrategy;
import ch.sabina.dp.template.TestTemplate;
import ch.sabina.dp.visitor.VisitorDemo;

public class MainClass {
	public static void main(String[] args) {
		//new TestCommand().testCommand();
		//new TestChainofResponsibility().chain();
		//new TestStrategy().testStrategy();
		//new TestRobot().testRobot();
		//new TestOrder().testOrder();
		//new TestTemplate().testTemplate();
		//new TestInterpreter().testInterpreter();
		//TestIterator.testIterator();
		new VisitorDemo().testVisitorDemo();
		new TestMemento().testMemento();
	}
}
