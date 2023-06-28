package Embarque;

import java.util.Scanner;

import Controle.AeronavesComGenerics;

public class PrincipalComGenerics {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		AeronavesComGenerics<Integer> air = new AeronavesComGenerics<>();
		System.out.println("Gen - Informe o nr de aeronaves");
		int nrAeronaves = sc.nextInt();
		
		for (int i = 0; i < nrAeronaves; i++) {
			Integer nrVoo = sc.nextInt();
			air.addVoo(nrVoo);
		}
		
		System.out.println("Gen - O 1º a decolar vai ser o nr: " + air.primeiroVoo());
		air.listaVoos();
		sc.close();
	}
}
