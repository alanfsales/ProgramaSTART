package EstruturaWhile;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        int totalAlunos = 10;
        
        Scanner leitor = new Scanner(System.in);
        
        while (totalAlunos > 0) {  
            System.out.println("Nome: ");
            String nomeAluno = leitor.next();
            
            System.out.println("Idade: ");
            int idadeAluno = leitor.nextInt();
            
            System.out.println("O nome do aluno é: " + nomeAluno 
                    + " e sua idade é: " + idadeAluno);
            
            totalAlunos = totalAlunos - 1;
        }
    }
    
}
