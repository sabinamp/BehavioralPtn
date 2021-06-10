package ch.sabina.dp.template;

public class TestTemplate {
	
	public void testTemplate() {
		System.out.println("For MYSQL....");
		ConnectionTemplateMethod template = new MySQLConnection();
		template.run();
		System.out.println("For Oracle...");
		template = new OracleConnection();
		template.run();
	}

}
