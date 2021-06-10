package ch.sabina.dp.interpreter.str;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

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
		 List<String> result = null;
				/*
				 * tables.entrySet() .stream() .filter(entry ->
				 * entry.getKey().equalsIgnoreCase(table)) .flatMap(entry ->
				 * Stream.of(entry.getValue())) .flatMap(Collection::stream) .map(Row::toString)
				 * .flatMap(columnMapper) .filter(whereFilter) .collect(Collectors.toList());
				 */
		          
		          //clear();

	        return result;
		 
	 }

	public void setFilter(Predicate<String> filter) {
		// TODO Auto-generated method stub
		
	}

	public void setTable(String table2) {
		// TODO Auto-generated method stub
		
	}
}
