import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ArrayListCarros {

	public static void main(String[] args) {
		// Contruindo um arraylist para carros
		ArrayList<String> carros = new ArrayList<>();

		// Adicionando carros ao arraylist
		carros.add("FLUENCE");
		carros.add("KOMBI");
		carros.add("JAGUAR");
		carros.add("BMW");
		carros.add("MERCEDES");
		carros.add("FUSCA");
		carros.add("VECTRA");
		carros.add("SANDERO");
		// Mostra o arrayList
		System.out.println(carros);

		// Substituir MERCEDES por MITSUBISHI
		carros.set(4, "MITSUBISHI");
		// Mostra o arrayList
		System.out.println(carros);

		// Remove VECTRA
		carros.remove("VECTRA");
		// Mostra o arrayList
		System.out.println(carros);

		// adiciona com JOpotionPane
		carros.add(JOptionPane.showInputDialog("Informe um Carro"));
		// Mostra o arrayList
		System.out.println(carros);

		// esvazia o arrayList
		// carros.clear();
		// Mostra o arrayList
		// System.out.println(carros);

		// Verifica se o array está vazio
		if (carros.isEmpty()) {
			System.out.println("O arrayList está vazio");
		}

		// Substitui quando não sabe a posição
		String pesquisar = "BMW";
		if (carros.contains(pesquisar)) {
			for (int i = 0; i < carros.size(); i++) {
				if (pesquisar.equals(carros.get(i))) {
					carros.set(i, "BUGATTI");
					break;
				}
			}
		}else {
			System.out.println("Carro não encontrado");
		}
		// Mostra o arrayList
		System.out.println(carros);
		
		System.out.println(carros.size());

	}
}
