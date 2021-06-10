package ch.sabina.dp;

import ch.sabina.dp.chainofresponsibility.TestChainofResponsibility;
import ch.sabina.dp.command.TestCommand;
import ch.sabina.dp.state.TestRobot;
import ch.sabina.dp.strategy.TestStrategy;

public class MainClass {
	public static void main(String[] args) {
		//new TestCommand().testCommand();
		//new TestChainofResponsibility().chain();
		//new TestStrategy().testStrategy();
		new TestRobot().testRobot();
	}
}
