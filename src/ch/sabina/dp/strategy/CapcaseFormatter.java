package ch.sabina.dp.strategy;

public class CapcaseFormatter implements TextFormattingStrategy{

	@Override
	public void format(String text) {
		System.out.println("[CapTextFormatter]:"+text.toUpperCase());
		
	}

}
