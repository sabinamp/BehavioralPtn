package ch.sabina.dp.interpreter.str;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

public class Context {
	//table name & list of rows
	 private static Map<String, List<Row>> tables = new HashMap<>();
	 
	 private String table;
	 private String column;
	 private Predicate<String> whereFilter;
	 
	 static {
	        List<Row> list = new ArrayList<>();
	        list.add(new Row("John", "Doe"));
	        list.add(new Row("Jan", "Kowalski"));
	        list.add(new Row("Dominic", "Doom"));

	        tables.put("people", list);
	    }
	 
	 List<String> search() {
		return null;
		 
	 }
}
