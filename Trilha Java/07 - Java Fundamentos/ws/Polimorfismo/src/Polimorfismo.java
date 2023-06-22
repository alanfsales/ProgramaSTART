
public class Polimorfismo {

	public static void main(String[] args) {
		Mamifero mamifero1 = new Elefante();
		System.out.println("Cola Diária de Leite de um Elefante: " + mamifero1.cotaDiariaLeite());
		
		Mamifero mamifero2 = new Rato();
		System.out.println("Cola Diária de Leite de um Rato: " + mamifero2.cotaDiariaLeite());
	}
}
