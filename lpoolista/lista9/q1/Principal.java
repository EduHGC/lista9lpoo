package lpoolista.lista9.q1;

public class Principal {

	public static void main(String[] args) {
		Shape s1 = new Circle(5.5, "red", false);
		System.out.println(s1);
		System.out.println(s1.getArea());
		System.out.println(s1.getPerimeter());
		System.out.println(s1.getColor());
		System.out.println(s1.isFilled());
		
		/*Linha abaixo gera erro de complilação. O objeto s1 tem o tipo de referência Shape. Não ocorre polimorfismo, 
		 pois o método getRadius() é declarado apenas na classe Circle, então o obejo não consegue ter o 
		 comportamento da classe pai quando este método é invocado.*/
		//System.out.println(s1.getRadius);
		
		System.out.println("-------------------");
		Circle c1 = (Circle)s1;
		System.out.println(c1);
		System.out.println(c1.getArea());
		System.out.println(c1.getPerimeter());
		System.out.println(c1.getColor());
		System.out.println(c1.isFilled());
		/*Agora é possível invocar o método get. É feito um downcasting, onde o objeto c1 com o tipo
		 de referência Circle recebe o objeto s1 sendo convertido explicitamente para tipo de referência 
		 Shape (super classe) para o tipo Circle (classe filha).*/
		System.out.println(c1.getRadius());
		
		System.out.println("-------------------");
		/*Na linha seguite existe um erro de compilação. A classe Shape está sendo instanciada com o 
		e a classe Shape é uma classe abstrata.*/
		//Shape s2 = new Shape();
		   
		Shape s3 = new Rectangle(1.0, 2.0, "red", false);
		System.out.println(s3);
		System.out.println(s3.getArea());
		System.out.println(s3.getPerimeter());
		System.out.println(s3.getColor());
		//Mesmo erro da linha 16 -> System.out.println(s1.getRadius);
		//System.out.println(s3.getLength());
		
		System.out.println("-------------------");
		Rectangle r1 = (Rectangle)s3;   
		System.out.println(r1);
		System.out.println(r1.getArea());
		System.out.println(r1.getColor());
		System.out.println(r1.getLength());
		
		System.out.println("-------------------");
		Shape s4 = new Square(6.6);     // Upcast
		System.out.println(s4);
		System.out.println(s4.getArea());
		System.out.println(s4.getColor());
		//Mesmo erro das linhas 16 e 41 
		//System.out.println(s4.getSide());
		
		System.out.println("-------------------");
		Rectangle r2 = (Rectangle)s4;
		System.out.println(r2);
		System.out.println(r2.getArea());
		System.out.println(r2.getColor());
		//Mesmo erro das linhas 16, 41 e 56. A classe Rectangle(pai) não implementa o método getSide()
		//System.out.println(r2.getSide());
		//Não ocorreu erro, pois a classe pai é Rectangle.
		System.out.println(r2.getLength());
		
		System.out.println("-------------------");
		Square sq1 = (Square)r2;
		System.out.println(sq1);
		System.out.println(sq1.getArea());
		System.out.println(sq1.getColor());
		System.out.println(sq1.getSide());
		System.out.println(sq1.getLength());
	}
}
