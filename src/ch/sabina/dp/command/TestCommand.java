package ch.sabina.dp.command;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestCommand {

	public void testCommand() {
		ExecutorService executorService= Executors.newFixedThreadPool(5);
		EmailJob emailJob =  new EmailJob();
		SMSJob smsJob = new SMSJob();
		FileIOJob fileIOJob= new FileIOJob();
		
		for(int i=0; i < 3; i++) {
			
			emailJob.setEmail(new Email());			
			smsJob.setSms(new Sms());		
			fileIOJob.setFileIO(new FileIO());
			
			executorService.submit( new Runnable() {
				
				@Override
				public void run() {
					emailJob.execute();
					
				}
			});
			executorService.submit(new Runnable() {
							
							@Override
							public void run() {
								smsJob.execute();								
							}
						});
			
			executorService.submit(new Runnable() {
				
				@Override
				public void run() {
					fileIOJob.execute();								
				}
			});
			
		}
		executorService.shutdown();
	}
}
