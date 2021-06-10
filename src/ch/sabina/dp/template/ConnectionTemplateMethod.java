package ch.sabina.dp.template;

//defines abstract operations that concrete subclasses define to implement steps of an algorithm
public abstract class ConnectionTemplateMethod {
	public final void run() {
		setDBDriver();
		setCredentials();
		connect();
		prepareStatement();		
		insert();
		close();
		destroy();
	}
	
	public abstract void setDBDriver();
	public abstract void setCredentials();
	
	public void connect() {
		System.out.println("Setting connection...");
	}
	public void prepareStatement() {
		System.out.println("Preparing insert statement...");
	}
	
	
	public void insert() {
		System.out.println("Inserting data...");
	}
	public void close() {
		System.out.println("Closing connections...");
	}
		public void destroy() {
		System.out.println("Destroying connection objects...");
		}

}
