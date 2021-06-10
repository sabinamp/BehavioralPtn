package ch.sabina.dp.interpreter.str;

import java.util.List;
import java.util.function.Predicate;

public class Where implements Expression {
	 private Predicate<String> filter;
	 
	@Override
	public List<String> interpret(Context ctx) {
		 ctx.setFilter(filter);
		return ctx.search();
	}

}
