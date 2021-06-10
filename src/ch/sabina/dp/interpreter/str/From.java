package ch.sabina.dp.interpreter.str;

import java.util.List;

public class From implements Expression {
	private String table;
    private Where where;
    
	@Override
	public List<String> interpret(Context ctx) {
		 ctx.setTable(table);
	        if (where == null) {
	            return ctx.search();
	        }
	        return where.interpret(ctx);
	}

}
