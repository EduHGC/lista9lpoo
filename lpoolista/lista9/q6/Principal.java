package lpoolista.lista9.q6;

public class Principal {

	public static void main(String[] args) {

		Animal cat = new Cat("A");
		Animal dog = new Dog("B");
		Animal bigdog = new BigDog("C");
		Dog dog3 = new BigDog("D");
		BigDog bigdog1 = new BigDog("E");
		
		cat.greets();
		
		System.out.println("-----------------");
		dog.greets();
		bigdog.greets();
		//dog.greets(dog);
		//bigdog.greets(bigdog);
		
		System.out.println("-----------------");
		Dog dog2 = (Dog)dog;
		dog2.greets();
		dog2.greets(dog2);
		
		System.out.println("-----------------");
		dog3.greets();
		dog3.greets(dog3);
		dog3.greets(bigdog1);
		
		System.out.println("-----------------");
		bigdog1.greets();
		bigdog1.greets(dog2);
		bigdog1.greets(bigdog1);
		
	}

}
