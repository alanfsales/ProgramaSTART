package Array;

import javax.swing.JOptionPane;

public class TrabalhandoArray {

	public static void main(String[] args) {
		String [] paises = new String[4];
		int[] numeros = new int[10];
		
		for (int i = 0; i < paises.length; i++) {
			paises[i] = JOptionPane.showInputDialog("Informe um país");
		}
		
		for (String pais : paises) {
			System.out.println(pais);
		}
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe um número"));
		}
		
		for (Integer num : numeros) {
			System.out.println(num);
		}
		
		int novoValor = 11;
		numeros[8] = novoValor + 4;
		
		for (Integer num : numeros) {
			System.out.println(num);
		}
	}
}
