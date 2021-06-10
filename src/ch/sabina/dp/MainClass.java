package ch.sabina.dp;

import ch.sabina.dp.chainofresponsibility.TestChainofResponsibility;
import ch.sabina.dp.command.TestCommand;

public class MainClass {
	public static void main(String[] args) {
		//new TestCommand().testCommand();
		new TestChainofResponsibility().chain();
	}
}
