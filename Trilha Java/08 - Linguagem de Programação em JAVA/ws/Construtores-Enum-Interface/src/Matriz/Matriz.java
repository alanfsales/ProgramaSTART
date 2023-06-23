package Matriz;

import javax.swing.JOptionPane;

public class Matriz {

	public static void main(String[] args) {
		String [] alunos = {"João", "José", "Maria"};
		float [][] notas = new float [3][4];
		float somaNotas, mediaAlunos;
		String statusAluno;
		
		for (int i = 0; i < 3; i++) {
			//System.out.println("Aluno: " + alunos[i]);
			somaNotas = 0;
			mediaAlunos = 0;
			for (int j = 0; j < 4; j++) {
				notas[i][j] = Float.parseFloat(JOptionPane.showInputDialog("Informe a nota nº "+ (j+1) + " do aluno " + alunos[i]));
				somaNotas = somaNotas + notas[i][j];
			}
			mediaAlunos = somaNotas / 4;
			if (mediaAlunos < 5.5) {
				statusAluno = "REPROVADO";
			}else if(mediaAlunos >= 5.5 && mediaAlunos <=7.5) {
				statusAluno = "EM RECUPEDAÇÂO";
			}else {
				statusAluno = "APROVADO";
			}
			
			System.out.println("\n**********BOLETIM**********");
			System.out.println("Aluno: " + alunos[i]);
			System.out.println("Notas");
			for (int j = 0; j < 4; j++) {
				System.out.println((j+1) + " - " + notas[i][j]);
			}
			System.out.println("Média ..: " + mediaAlunos + " - " + statusAluno);
		}
	}

}
