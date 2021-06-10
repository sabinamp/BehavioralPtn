package ch.sabina.dp.observer;

public class TestObserver {
	
	public void testObserver() {
		Commentary c1 = new Commentary("EM Weltmeisterschaft");
		
		SObserver obs1 = new SMSObserver(c1,  "Maria Peter");
		SObserver obs2 = new SMSObserver(c1,  "Camelia Peter");
		SObserver obs3 = new SMSObserver(c1,  "Sabina Peter");
		c1.setDesc("Welcome to live Soccer match");
		c1.setDesc("Welcome to the 2nd live Soccer match");
	}

}
