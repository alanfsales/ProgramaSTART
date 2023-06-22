package Interface;

public class Gado implements Animal {

	@Override
	public void animalSom() {
		System.out.println("Muuuu");
	}

	public void animalComer() {
		System.out.println("Comendo capim");
	}

	@Override
	public void animalAbrigo() {
		System.out.println("Curral");
	}
}
