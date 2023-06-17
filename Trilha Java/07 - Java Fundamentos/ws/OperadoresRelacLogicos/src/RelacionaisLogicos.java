
public class RelacionaisLogicos {

	public static void main(String[] args) {
		//Operadores Relacionais
		// >, <, >=, <=, !=, ==
		
		int num1, num2;
		
		//Testando uma igualdade
		num1 = 10;
		num2 = 10;
		if(num1 == num2) {
			System.out.println("Número 1 e número 2 são iguais");
		}
		
		//Testtando uma desigualdade
		num1 = 10;
		num2 = 30;
		if(num1 != num2) {
			System.out.println("Número 1 e número 2 são diferentes");
		}
		
		//Testtando maior que
		num1 = 10;
		num2 = 30;
		if(num1 > num2) {
			System.out.println("Número 1 é maior que número 2");
		}else {
			System.out.println("Número 2 é maior que número 1");
		}
		
		//Testtando menor que
		num1 = 10;
		num2 = 30;
		if(num1 < num2) {
			System.out.println("Número 1 é menor que número 2");
		}else {
			System.out.println("Número 2 é menor que número 1");
		}
		
		//Operadores Logicos
		//&& = e/and - || = ou/or 
		num1 = 10;
		num2 = 5;
		int num3 = 20, num4 = 5;
		if ((num1 > num3) && (num2 == num4)) {
			System.out.println("Primeira opção satisfeita");
		}else {
			System.out.println("Segunda opção satisfeita");
		}
		
		if ((num1 > num3) || (num2 == num4)) {
			System.out.println("Primeira opção satisfeita");
		}else {
			System.out.println("Segunda opção satisfeita");
		}
	}
}
