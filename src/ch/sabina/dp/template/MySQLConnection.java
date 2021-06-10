package ch.sabina.dp.template;

public class MySQLConnection extends ConnectionTemplateMethod{

	@Override
	public void setDBDriver() {
		System.out.println("Setting MySQL drivers...");

		
	}

	@Override
	public void setCredentials() {
		System.out.println("Setting credentials for MySQLB...");
		
	}

}
