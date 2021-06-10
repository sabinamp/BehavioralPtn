package ch.sabina.dp.visitor;

import java.util.UUID;

public class VisitorDemo {
	public void testVisitorDemo() {
		Visitor v = new ElementVisitor();

        Document d = new Document(UUID.randomUUID().toString());
        d.elements.add(new JsonElement(UUID.randomUUID().toString()));
        d.elements.add(new JsonElement(UUID.randomUUID().toString() ));
		d.elements.add(new XMLElement(UUID.randomUUID().toString()));

        d.accept(v);
	}
	

}
