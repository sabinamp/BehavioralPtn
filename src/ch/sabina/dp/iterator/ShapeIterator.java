package ch.sabina.dp.iterator;

import java.util.Iterator;

public class ShapeIterator implements Iterator<Shape>{
	private Shape [] shapes;
	int pos;
	public ShapeIterator(Shape []shapes){
		this.shapes = shapes;
	}
	
	@Override
	public boolean hasNext() {				
		return (pos)< shapes.length && shapes[pos]!=null;
	}

	@Override
	public Shape next() {
		
		return shapes[pos++];
	}
	
	public void remove() {
		if(pos <=0 )
			throw new IllegalStateException("Illegal position");
		if(shapes[pos] !=null){
			System.out.println("removing :"+shapes[pos]);
			for (int i= pos; i<(shapes.length-1);i++){
				shapes[i] = shapes[i+1];
			}
				shapes[shapes.length-1] = null;
				
		}
	}

}
