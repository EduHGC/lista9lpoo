package lpoolista.lista9.q4;

public class Principal {

	public static void main(String[] args) {
		Movable center = new MovableCircle(0, 0, 5, 5, 10);
		
		System.out.println(center);
		System.out.println("-----------------");
		
		center.moveRight();
		center.moveRight();
		System.out.println(center);
		System.out.println("-----------------");
		
		center.moveUp();
		System.out.println(center);
		System.out.println("-----------------");
		
		center.moveLeft();
		center.moveLeft();
		System.out.println(center);
		System.out.println("-----------------");
		
		center.moveDown();
		System.out.println(center);
		System.out.println("-----------------");
		

	}

}
