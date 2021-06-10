package ch.sabina.dp.chainofresponsibility;

public class TextFileHandler implements Handler {
	private String handlerName;
	private Handler handler;
	
	public TextFileHandler(String handlerName){
        this.handlerName = handlerName;
}

	@Override
	public void setHandler(Handler handler) {
		this.handler = handler;

	}

	@Override
	public void process(Fileh file) {
		if(file.getFileType().equals("text")) {
			 System.out.println("Process and saving text file... by "+ handlerName);
		}else if(this.handler != null) {
			this.handler.process(file);
		}else {
			System.out.println("File not supported");
		}

	}

	@Override
	public String getHandlerName() {
		
		return this.handlerName;
	}

}
