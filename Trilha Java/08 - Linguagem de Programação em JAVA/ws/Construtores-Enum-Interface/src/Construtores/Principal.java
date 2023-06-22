package Construtores;

import Construtores.Aluno.MATRICULA;
import Construtores.Aluno.STATUS;

public class Principal {

	public static void main(String[] args) {
		//Passando os dados através do construtor
		Aluno aluno = new Aluno(8, 8, 8);
		//Calculando a média
		double media = aluno.calcularMedia();
		
		//Define a situação do aluno
		if (media < 6 ) {
			aluno.situacaoAluno = STATUS.REPROVADO;
		} else {
			aluno.situacaoAluno = STATUS.APROVADO;
		}
		
		//Imprime a situação do aluno
		System.out.println("A média do aluno é: " + media + " e o aluno está " + aluno.situacaoAluno);
		
		//Usa enum MATRICULA
		aluno.situacaoMatricula = MATRICULA.MATRICULADO;
		System.out.println("O aluno está: " + aluno.situacaoMatricula);
	}
}
