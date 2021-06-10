package ch.sabina.dp.visitor;

public class XMLElement extends Element {
	
	public XMLElement(String uuid) {
		super.uuid = uuid;
	}
	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}

}
