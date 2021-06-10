package ch.sabina.dp.observer;

import java.util.ArrayList;
import java.util.List;

public class Commentary implements Publisher {
	private final List<SObserver> observers;
	private String desc;
	private final String subjectDetails;
	
	public Commentary( String subjectDetails){
		this.observers = new ArrayList<SObserver>();;
		this.subjectDetails = subjectDetails;
	}

	@Override
	public void subscribeObserver(SObserver observer) {
		this.observers.add(observer);
		
	}

	@Override
	public void unSubscribeObserver(SObserver observer) {
		this.observers.remove(observer);		
	}

	@Override
	public void notifyObservers() {
		for(SObserver each: observers) {
			each.update(desc);
		}
		
	}

	@Override
	public String subjectDetails() {
		
		return this.subjectDetails;
	}
	
	
	public void setDesc(String desc) {
		this.desc = desc;
		notifyObservers();
	}
	
}
