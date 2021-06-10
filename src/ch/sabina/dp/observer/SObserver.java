package ch.sabina.dp.observer;

public interface SObserver {
	public void update(String desc);
	public void subscribe();
	public void unSubscribe();
}
