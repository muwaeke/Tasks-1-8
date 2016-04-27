
public class Main {

	public static void main(String[] args) {
		Circle c = new Circle(2);
		
		System.out.println(c.getArea());
		System.out.println(c.getRadius());
		c.setradius(5);
		System.out.println(c.getArea());
		System.out.println(c.getRadius());

	}

}
