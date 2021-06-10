package ch.sabina.dp.interpreter.str;

import java.util.List;

public interface Expression {
	List<String> interpret(Context ctx);
}
