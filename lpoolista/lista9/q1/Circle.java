package lpoolista.lista9.q1;

public class Circle extends Shape{
	
	protected double radius = 1.0;
	
	public Circle() {
		
	}
	
	public Circle(double radius, String color, boolean filled) {
		super(color, filled);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	protected double getArea() {
		return 3.14 * (this.radius * this.radius);
	}
	
	protected double getPerimeter() {
		return 2 * 3.14 * this.radius;
	}

	@Override
	public String toString() {
		return "Circle[Shape[color=" + color + ", filled=" + filled + "], radius=" + radius +"]";
	}
}
