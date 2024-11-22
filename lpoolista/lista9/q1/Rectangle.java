package lpoolista.lista9.q1;

public class Rectangle extends Shape{
	protected double width = 1.0;
	protected double length = 1.0;
	
	public Rectangle() {
	
	}
	
	public Rectangle(double width, double length) {
		super();
		this.width = width;
		this.length = length;
	}

	public Rectangle(double width, double length, String color, boolean filled) {
		super(color, filled);
		this.width = width;
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}
	
	protected double getArea() {
		return this.width * this.length;
	}
	
	protected double getPerimeter() {
		return 2 * this.width + 2 * this.length;
	}

	@Override
	public String toString() {
		return "Rectangle[Shape[color=" + color + ", filled=" + filled + "], width=" + width + ", length=" + length + "]";
	}
}
