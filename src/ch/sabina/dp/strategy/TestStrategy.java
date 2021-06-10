package ch.sabina.dp.strategy;

public class TestStrategy {
	
	public void testStrategy() {
		TextFormattingStrategy formatter = new CapcaseFormatter();
		TextEditor editor = new TextEditor(formatter);
		editor.publishText("Testing text in lower formatter");
		
		TextFormattingStrategy formatter2 = new LowercaseFormatter();
		editor= new TextEditor(formatter2);
		editor.publishText("Testing text in caps formatter");
		
	}
	

}
