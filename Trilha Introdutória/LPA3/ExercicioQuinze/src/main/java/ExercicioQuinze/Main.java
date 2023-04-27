package ExercicioQuinze;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        int numero; 
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite um valor");
        numero = leitor.nextInt();
        
        if(numero >= 100 && numero <= 200){
            System.out.println("O número está no intervalo");
        }else{
            System.out.println("O número não está no interva");
        }
                
    }
    
}
