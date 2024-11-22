package lpoolista.lista9.q5;

import java.util.Locale;

public class TestResizableCircle {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		ResizableCircle resize = new ResizableCircle(10);
		
		System.out.println(resize);
		System.out.println(String.format("%.1f", resize.getArea()));
		System.out.println(String.format("%.1f", resize.getPerimeter()));
		
		System.out.println("-------------");
		resize.resize(50);
		System.out.println(String.format("%.1f", resize.getArea()));
		System.out.println(String.format("%.1f", resize.getPerimeter()));
		System.out.println();
		
		System.out.println("-------------");
		GeometricObject resize1 = new ResizableCircle(15);
		System.out.println(String.format("%.1f", resize1.getPerimeter()));
		

	}

}
