package Exercicio22;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        String nomeProduto;
        float precoCusto;
        float precoVenda;
        
        float totalCusto = 0.0f;
        float totalVenda = 0.0f;
        
        Scanner leitor = new Scanner(System.in);
        int i = 0;
        for (; i < 40; i++) {
            System.out.println("Digite o nome do Produto");
            nomeProduto = leitor.next();
            
            System.out.println("Digite o preço de custo");
            precoCusto = leitor.nextFloat();
            
            System.out.println("Digite o preço de venda");
            precoVenda = leitor.nextFloat();
            
            totalCusto = totalCusto + precoCusto;
            totalVenda = totalVenda + precoVenda;
            
            if(precoCusto == precoVenda){
                System.out.println("Houve um empate entre o preço de custo e o de venda");
            }else{
                if(precoCusto > precoVenda){
                    System.out.println("Prejuiso");
                }else{
                    System.out.println("Lucro");
                }
            }
            
        }
        System.out.println("A média do preço de custo é de: "+ totalCusto/i);
        System.out.println("A média do preço de venda é de: "+ totalVenda/i);
    }
    
}
