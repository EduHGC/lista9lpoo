package lpoolista.lista9.q8;

public class TestPoint {

	public static void main(String[] args) {
		Movable m1 = new MovablePoint(5, 6, 10, 15);
		System.out.println(m1);
		m1.moveLeft();
		System.out.println(m1);
		
		System.out.println("------------------------------------------------------------------");
		Movable m2 = new MovableCircle(1, 2, 3, 4, 20);
		System.out.println(m2);
		m2.moveRight();
		System.out.println(m2);
		
		System.out.println("------------------------------------------------------------------");
		Movable m3 = new MovableRectangle(0, 5, 5, 0, 1, 1);
		System.out.println(m3);
		System.out.println("------------------------------------------------------------------");
		m3.moveUp();
		System.out.println(m3);
		
		System.out.println("------------------------------------------------------------------");
		m3.moveLeft();
		System.out.println(m3);
		
		System.out.println("------------------------------------------------------------------");
		m3.moveDown();
		System.out.println(m3);
		
		System.out.println("------------------------------------------------------------------");
		m3.moveRight();
		System.out.println(m3);
		
		System.out.println("------------------------------------------------------------------");
		System.out.println("Interfaces definine um conjunto de métodos, sem implementação, que devem ser implementados\n"
				+ "na classe. Já as classes abstratas, são classes que servem como modelo para classes filhas que\n"
				+ "herdam tanto atributos quanto métodos, e/ou métodos abstratos que é obrigatório serem implementados.");
	}
}
