package ch.sabina.dp.observer;



public interface Publisher {
	public void subscribeObserver(SObserver observer);
	public void unSubscribeObserver(SObserver observer);
	public void notifyObservers();
	public String subjectDetails();

}
