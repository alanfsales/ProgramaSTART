package Heranca;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Vendedor v = new Vendedor();
        v.setNome("Marcio");
        v.setSalario(100.0f);
        v.setCpf("123546789");
        v.setDataNascimento(new Date());
        v.setComissaoPorITem(10.0f);
        v.setTotalItensVendidos(10);
        
        System.out.println("Salario do vendedor é: " + v.calcularSalario());
       
        Motorista m = new Motorista();
        
    }
    
}
