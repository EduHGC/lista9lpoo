package lpoolista.lista9.q5;

import java.util.Locale;

public class TestCircle {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Circle circle = new Circle(10);
		
		System.out.println(String.format("%.1f", circle.getArea()));
		System.out.println(String.format("%.1f", circle.getPerimeter()));
		System.out.println(circle);

	}

}
