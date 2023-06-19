
public class LacoRepeticaoWhile {

	public static void main(String[] args) {
		//Comando WHILE - laço pre testado
		int qtdVezes = 1;
		while (qtdVezes <= 10) {
			System.out.println("Estou fazendo a " + qtdVezes + "ª vez");
			qtdVezes++;
		}
		System.out.println("Saí da laço e execultei " + (qtdVezes-1) +" vezes");
		
		// Comando DO WHILE - laço pos testado
		qtdVezes = 1;
		do {
			System.out.println("Estou fazendo a " + qtdVezes + "ª vez");
			qtdVezes++;
		} while (qtdVezes <= 10);
		System.out.println("Saí da laço e execultei " + (qtdVezes-1) +" vezes");
	}
}
