package lpoolista.lista9.q1;

public class Square extends Rectangle{

	public Square() {
		super();
	}

	public Square(double side) {
		super();
		super.setWidth(side);
		super.setLength(side);
	}
	
	public Square(double side, String color, boolean filled) {
		super();
		super.setWidth(side);
		super.setLength(side);
		super.setColor(color);
		super.setFilled(filled);
	}
	
	public double getSide() {
		return super.getLength();
	}
	
	public void setSide(double side) {
		super.setLength(side);
		super.setWidth(side);
	}
	
	
}
