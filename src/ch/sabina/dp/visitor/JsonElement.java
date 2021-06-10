package ch.sabina.dp.visitor;

public class JsonElement extends Element {
	
	public JsonElement(String s) {
		super.uuid = s;
	}
	@Override
	public void accept(Visitor v) {
		v.visit(this);

	}

}
