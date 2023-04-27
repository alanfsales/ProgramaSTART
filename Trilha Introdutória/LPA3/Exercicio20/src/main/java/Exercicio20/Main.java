package Exercicio20;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    
        int anoFabricacao = 0;
        float valorVeiculo = 0.0f;
        float porcentagemDesconto = 0.0f;
        float valorDesconto = 0.0f;
        float valorPagar = 0.0f;
        
        int totalCarrosSemiNovo = 0;
        int totalCarros = 0;
        
        Scanner leitor = new Scanner(System.in);
        
        char desejaRepetir = 's';
        
        while(desejaRepetir == 's' || desejaRepetir == 'S'){
            System.out.println("Digite o ano de Fabricaçao: ");
            anoFabricacao = leitor.nextInt();
            
            System.out.println("Digite o valor: ");
            valorVeiculo = leitor.nextFloat();
            
            if(anoFabricacao <= 2000){
                porcentagemDesconto = 0.12f;
            }else{
                porcentagemDesconto = 0.07f;
                totalCarrosSemiNovo++;
            } 
            totalCarros++;
            
            valorDesconto = porcentagemDesconto * valorVeiculo;
            valorPagar = valorVeiculo - valorDesconto;
            
            System.out.println("O valor do desconto foi: " + valorDesconto);
            System.out.println("O valor que deve ser pago é: " + valorPagar);
            
            System.out.println("Deseja fazer mais cadastro? S/N");
            desejaRepetir = leitor.next().charAt(0);
        }
        
        System.out.println("Total de carros semi novos: " + totalCarrosSemiNovo);
        System.out.println("Total de carros: " + totalCarros);
    }
    
}
