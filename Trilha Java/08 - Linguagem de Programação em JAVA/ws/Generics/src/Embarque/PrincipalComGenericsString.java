package Embarque;

import java.util.Scanner;

import Controle.AeronavesComGenerics;

public class PrincipalComGenericsString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		AeronavesComGenerics<String> air = new AeronavesComGenerics<>();
		System.out.println("Str - Informe o nr de aeronaves");
		int nrAeronaves = sc.nextInt();
		
		for (int i = 0; i < nrAeronaves; i++) {
			String nrVoo = sc.next();
			air.addVoo(nrVoo);
		}
		
		System.out.println("Str - O 1º a decolar vai ser o nr: " + air.primeiroVoo());
		air.listaVoos();
		sc.close();
	}
}
