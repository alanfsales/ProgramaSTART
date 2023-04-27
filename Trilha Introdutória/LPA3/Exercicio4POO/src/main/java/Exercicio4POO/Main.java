package Exercicio4POO;

public class Main {

    public static void main(String[] args) {
    
        Invoice inv = new Invoice(1, "mouse", -10, 50.0f);
        
        System.out.println("Valor Total: " + inv.getInvoiceAmount());
        
    }
    
}
