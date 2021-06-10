package ch.sabina.dp.interpreter.str;

public class Row {
	private String firstName;
	private String lastName;
	
	public Row(String string1, String string2) {
		this.firstName = string1;
		this.lastName = string2;
	}

	private String getFirstName() {
		return firstName;
	}

	private String getLastName() {
		return lastName;
	}

}
