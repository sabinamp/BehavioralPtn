package ch.sabina.dp.command;


public class EmailJob implements Command {
	private Email email;
	
	public void setEmail(Email email){
		this.email = email;
	}

	@Override
	public void execute() {
		System.out.println("Job ID: "+Thread.currentThread().getId()+" executing an email job.");
		if(email != null) {
			this.email.sendEmail();
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}

	}

}
