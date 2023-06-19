
public class ComandoCondicionalIf {

	public static void main(String[] args) {
		//IF
		
		int num1 =10, num2 = 30;
		if (num1 < num2) {
			System.out.println("if Normal - Número 1 é menor que número 2");
		}
		
		if (num1 > num1) {
			System.out.println("if com else - Número 1 é maior que número 2");
		} else {
			System.out.println("if com else - Número 1 é menor que número 2");
		}
		
		
		// Condição composta - situação num1 menor num2
		if (num1 > num2) {
			System.out.println("Condião composta 1 - Número 1 é maior que número 2");
		} else if (num1 < num2) {
			System.out.println("Condião composta 1 - Número 1 é menor que número 2");
		}else{
			System.out.println("Condião composta 1 - Número 1 é igual que número 2");
		}
		
		// Condição composta - situação num1 igual num2
		num2 = 10;
		if (num1 > num2) {
			System.out.println("Condião composta 2 - Número 1 é maior que número 2");
		} else if (num1 < num2) {
			System.out.println("Condião composta 2 - Número 1 é menor que número 2");
		}else{
			System.out.println("Condião composta 2 - Número 1 é igual que número 2");
		}
	}
}
