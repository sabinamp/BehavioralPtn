package ch.sabina.dp.command;

public class SMSJob implements Command {
	private Sms sms;
	
	public void setSms(Sms sms) {
		this.sms = sms;
	}
	
	@Override
	public void execute() {
		System.out.println("Job ID: "+Thread.currentThread().getId()+" executing an Sms job.");
		if(this.sms != null) {
			sms.sendSms();
		}
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}

}
