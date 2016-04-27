
public class Circle {
	private double radius;
	private double area;
	
	public Circle(double radius){
		this.radius = radius;
		this.area =(Math.PI * Math.pow(radius, 2));
		
	}
	public void setradius (double radius){
		this.radius = radius;
		this.area =(Math.PI * Math.pow(radius, 2));
		
	}
	public void setarea (double area){
		this.area = area;
		this.radius = (Math.sqrt(area/Math.PI));
		
	}
	public double getRadius(){
		return radius;
	}
	public double getArea(){
	return area;
}
	

}
