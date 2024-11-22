package lpoolista.lista9.q5;

public class Circle implements GeometricObject{
	protected double radius;

	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double getPerimeter() {
		return 3.14 * 2 * this.radius;
	}
	
	public double getArea() {
		return 3.14 * (this.radius * this.radius);
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
	
}
