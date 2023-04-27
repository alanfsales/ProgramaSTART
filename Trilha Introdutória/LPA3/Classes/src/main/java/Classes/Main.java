package Classes;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Pessoa pessoa = new Pessoa(70f, 1.7f);
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o peso: ");
        pessoa.setPeso(leitor.nextFloat()); 
        System.out.println("Digite a altura: ");
        pessoa.setAltura(leitor.nextFloat());
        
        System.out.println("IMC - " + pessoa.calcularIMC());
        
        
        
        
    }
    
}
