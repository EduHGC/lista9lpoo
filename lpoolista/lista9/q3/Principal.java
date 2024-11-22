package lpoolista.lista9.q3;

public class Principal {

	public static void main(String[] args) {
		Movable point = new MovablePoint(0, 0, 5, 5);
		
		System.out.println(point);
		
		point.moveUp();
		System.out.println("----------");
		System.out.println(point);
		
		
		point.moveRight();
		point.moveRight();
		System.out.println("----------");
		System.out.println(point);
		
		
		point.moveDown();
		System.out.println("----------");
		System.out.println(point);
		
		
		point.moveLeft();
		point.moveLeft();
		System.out.println("----------");
		System.out.println(point);
		
	}

}
