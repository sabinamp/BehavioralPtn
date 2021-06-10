package ch.sabina.dp.strategy;

public class TextEditor {
	private final TextFormattingStrategy textFormatter;
	
	public TextEditor(TextFormattingStrategy textFormatter){
		this.textFormatter = textFormatter;
	}
	
	public void publishText(String text){
		textFormatter.format(text);
	}

}
