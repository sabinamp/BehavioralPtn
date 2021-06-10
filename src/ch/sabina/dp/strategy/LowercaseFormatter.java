package ch.sabina.dp.strategy;

public class LowercaseFormatter implements TextFormattingStrategy{

	@Override
	public void format(String text) {
		System.out.println("[LowerTextFormatter]:"+text.toLowerCase());
		
	}

}
