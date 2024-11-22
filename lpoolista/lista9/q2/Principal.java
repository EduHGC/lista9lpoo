package lpoolista.lista9.q2;

import java.util.Locale;

public class Principal {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		GeometricObject figura1 = new Circle(5.0);
		GeometricObject figura2 = new Rectangle(4.0, 5.0);
		
		System.out.println(figura1);
		System.out.println(figura1.getArea());
		System.out.println(String.format("%.1f", figura1.getPerimeter()));
		System.out.println("------------------");
		System.out.println(figura2);
		System.out.println(figura2.getArea());
		System.out.println(figura2.getPerimeter());
	}
}
