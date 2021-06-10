package ch.sabina.dp.strategy;

 interface Strategy{
	void formatX(String txt);
}
 class TextEditor2{
	 private final Strategy formatter;
	 TextEditor2(Strategy formatter){
		 this.formatter = formatter;
	 }
	 
	 void publishText(String txt) {
		formatter.formatX(txt);
	 }
 }
public class TestStrategy {
	
	public void testStrategy() {
		TextFormattingStrategy formatter = new CapcaseFormatter();
		TextEditor editor = new TextEditor(formatter);
		editor.publishText("Testing text in lower formatter");
		
		TextFormattingStrategy formatter2 = new LowercaseFormatter();
		editor= new TextEditor(formatter2);
		editor.publishText("Testing text in caps formatter");
		
		Strategy formatter3 = new Strategy() {
			@Override
			public void formatX(String txt) {
				System.out.println("[TextFormatter X]: "+txt);
			}
		};
		
		TextEditor2 ed2= new TextEditor2(formatter3);
		ed2.publishText("txt to format with inner interface");
		
	}
	

}

