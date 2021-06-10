package ch.sabina.dp.observer;

public class SMSObserver implements SObserver {
	private String desc;
	private String userInfo;
	private final Publisher pub;
	
	public SMSObserver(Publisher pub, String userInfo) {
		if(pub==null){
			throw new IllegalArgumentException("No Publisher found.");
			}

		this.pub = pub;		
		this.userInfo = userInfo;
		subscribe();
	}

	@Override
	public void update(String desc) {
		this.desc= desc;
		display();

	}

	private void display(){
		System.out.println("["+userInfo+"]: received update "+desc);
	}
	
	@Override
	public void subscribe() {
		System.out.println("Subscribing "+userInfo+" to "+pub.subjectDetails()+".");
		pub.subscribeObserver(this);

	}

	@Override
	public void unSubscribe() {
		this.pub.unSubscribeObserver(this);
		System.out.println("Unsubscribing "+userInfo+" from "+pub.subjectDetails()+".");

	}

}
