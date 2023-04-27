package EstruturaCondicionalSe;

public class Main {

    public static void main(String[] args) {
        
        int media = 7;
        
        /*
            Operadores Relacionais
            >
            >=
            <
            <=
            ==
            !=
        
            Opedadores Logicos
        
            &&
            ||
            !
        */
        
        if (media >= 7 ) {
            if(media == 10){
               System.out.println("Aprovado com nota Maxima");    
            }else{
                System.out.println("Aprovado");   
            }
        }else{
            System.out.println("Reprovado");
        }
    }
    
}
