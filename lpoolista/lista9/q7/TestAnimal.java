package lpoolista.lista9.q7;

public class TestAnimal {

	public static void main(String[] args) {
		Cat cat1 = new Cat();
		//Chamando o método greeting() herdado de Animal que se comporta de acordo com a implementação em Cat
		cat1.greeting();
		Dog dog1 = new Dog();
		//Chamando o método greeting() herdado de Animal que se comporta de acordo com a implementação em Dog
		dog1.greeting();
		BigDog bigDog1 = new BigDog();
		//Chamando o método greeting() herdado de Dog (que herda de Animal) que se comporta de acordo com a 
		//implementação em BigDog
		bigDog1.greeting();
		 
		// Usando poliformisfo
		Animal animal1 = new Cat();
		animal1.greeting();
		Animal animal2 = new Dog();
		animal2.greeting();
		Animal animal3 = new BigDog();
		animal3.greeting();
		//Classe abstrata não pode ser instânciada.
		//Animal animal4 = new Animal();
		  
		// Fazendo o downcasting para invovar métodos próprios da classe Dog
		Dog dog2 = (Dog)animal2;
		BigDog bigDog2 = (BigDog)animal3;
		Dog dog3 = (Dog)animal3;
		//Cat cat2 = (Cat)animal2;
		dog2.greeting(dog3);
		dog3.greeting(dog2);
		dog2.greeting(bigDog2);
		bigDog2.greeting(dog2);
		bigDog2.greeting(bigDog1);

	}
}
