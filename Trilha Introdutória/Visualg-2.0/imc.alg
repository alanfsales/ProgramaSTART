algoritmo "imc"

var
   altura, peso, imc: real
inicio
      escreval("Informe sua altura: ")
      leia(altura)
      escreval("Informe seu peso: ")
      leia(peso)
      
      imc <- peso / altura ^ 2
      
      se imc < 19 entao
         escreval("Abaixo do peso")
      senao
           se imc < 24 entao
              escreval("Peso ideal")
           senao
              escreval("Acima do peso")
           fimse
      fimse
fimalgoritmo
