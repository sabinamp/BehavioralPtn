package ch.sabina.dp.iterator;

public class TestIterator {
	 public static void testIterator() {
		 ShapeStorage storage = new ShapeStorage();
		 storage.addShape("Polygon");
		 storage.addShape("Hexagon");
		 storage.addShape("Circle");
		 storage.addShape("Rectangle");
		 storage.addShape("Square");
		 
		 ShapeIterator iterator = new ShapeIterator(storage.getShapes());
		 while(iterator.hasNext()){
			 System.out.println(iterator.next());
		 }
		 
		 System.out.println("******Apply removing while iterating...");
		 iterator = new ShapeIterator(storage.getShapes());
		 while(iterator.hasNext()){
			 System.out.println(iterator.next());
			 iterator.remove();
		 }
	 }
}
