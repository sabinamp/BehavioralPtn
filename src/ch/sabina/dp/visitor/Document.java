package ch.sabina.dp.visitor;

import java.util.ArrayList;
import java.util.List;

public class Document extends Element{
	
	List<Element> elements;
	
	public Document(String uuid) {
		super.uuid = uuid;
		elements = new ArrayList<>();
	}
	
	@Override
	public void accept(Visitor v) {
		for(Element each: elements) {
			v.visit(each);
		}
		
	}
	
	
	
}
