package lpoolista.lista9.q2;

public class Circle implements GeometricObject{
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return 3.14 * (this.radius * this.radius);
	}
	
	public double getPerimeter() {
		return 2 * 3.14 * this.radius;
	}
	
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
	
}
