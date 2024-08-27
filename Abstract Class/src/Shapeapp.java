
public class Shapeapp  {

	public static void main(String[] args) {

		Shape s ;
		s = new Circle();
		s.findarea();
		s.printarea();
		s = new Triangle();
		s.findarea();
		s.printarea();
		s = new Rectangle();
		s.findarea();
		s.printarea();
		
		//or
		
		Shape s1 = new Circle();
		s1.findarea();
		s1.printarea();
		
		
	}

}
