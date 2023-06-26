import java.util.LinkedList;

public class LinkedListCarros {

	public static void main(String[] args) {
		LinkedList<String> cars = new LinkedList<>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		System.out.println(cars);

		// Adiciona no Inicio
		cars.addFirst("Mazada");
		System.out.println(cars);

		// Adiciona no Fim
		cars.addLast("Bugatti");
		System.out.println(cars);

		// pegar informando a posição
		String carro;
		carro = cars.get(3);
		System.out.println(carro);

		// Remover o primeiro
		cars.removeFirst();
		System.out.println(cars);
		
		// Remover último
		cars.removeLast();
		System.out.println(cars);

		// pegar o primeiro
		System.out.println(cars.getFirst());
//		System.out.println(cars);

		// pegar o último
		System.out.println(cars.getLast());
//		System.out.println(cars);
		
		cars.clear();
		if (cars.isEmpty()) {
			System.out.println("LinkedList vazio");
		}
	}
}
