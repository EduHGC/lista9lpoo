package lpoolista.lista9.q5;

public class ResizableCircle extends Circle implements Resizable{

	public ResizableCircle(double radius) {
		super(radius);
	}
	
	public void resize(int percent) {
		this.radius *= (percent/100.0);
	}

	@Override
	public String toString() {
		return "ResizableCircle [radius=" + radius + "]";
	}
	
	
}
