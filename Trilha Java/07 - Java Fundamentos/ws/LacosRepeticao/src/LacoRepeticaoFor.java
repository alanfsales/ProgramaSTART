
public class LacoRepeticaoFor {

	public static void main(String[] args) {
		//for
		int qtdVezes = 1;
		for (int qtdVezes1 = 1; qtdVezes1 <= 10; qtdVezes1++) {
			System.out.println("Estou fazendo a " + qtdVezes1 + "ª vez");
			qtdVezes++;
		}
		System.out.println("Saí da laço e execultei " + (qtdVezes-1) +" vezes");
		
		for (int qtdVezes1 = 1; qtdVezes1 <= 10; qtdVezes1++) {
			System.out.println("Estou fazendo a " + qtdVezes1 + "ª vez");
			if (qtdVezes1 == 5) {
				System.out.println("Parei na " + (qtdVezes1) +"ª ves");
				break;
			}
		}
	}
}
