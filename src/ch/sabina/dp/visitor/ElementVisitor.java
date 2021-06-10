package ch.sabina.dp.visitor;

public class ElementVisitor implements Visitor {

	public void visit(XMLElement xmle) {
		 System.out.println(
		          "processing an XML element with uuid: " + xmle.uuid);

	}

	public void visit(JsonElement jelem) {
		System.out.println(
		          "processing a JSON element with uuid: " + jelem.uuid);
	}

	public void visit(Document doc) {
		System.out.println(
		          "processing a JSON element with uuid: " + doc.uuid);
		
	}

	@Override
	public void visit(Element elem) {
		System.out.println(
		          "processing an element of type "+ elem.getClass().toString()+" with uuid: " + elem.uuid);
		
	}

}
