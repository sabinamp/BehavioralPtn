package ch.sabina.dp.command;


public class FileIOJob implements Command {
	private FileIO fileIO;
	
	public void setFileIO(FileIO fileIO){
		this.fileIO = fileIO;
	}
	

	@Override
	public void execute() {
		System.out.println("Job ID: "+Thread.currentThread().getId()+" executing a fileIO job.");
		if(this.fileIO != null) {
			this.fileIO.sendToFile();
		}
		try {
			Thread.sleep(1000);
		}catch(InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
		
	}

}
