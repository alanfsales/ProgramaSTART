package Array;

public class ImprimeArray {

	public static void main(String[] args) {
		//Declarando o array
		String [] paises = new String[5];
		
		//Inicializando o array
		paises[0] = "Brasil";
		paises[1] = "Alemanha";
		paises[2] = "Itália";
		paises[3] = "Áustria";
		paises[4] = "Polônia";
		
		for (String lista: paises) {
			System.out.println(lista);
		}
	}
}
