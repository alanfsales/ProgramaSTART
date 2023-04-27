algoritmo "ExercicioVetoresEU"

var
numeros: vetor[1..5] de inteiro
numerosInvertido: vetor[1..5] de inteiro
i,y: inteiro

inicio

para i de 1 ate 5 faca
     escreval("Informe um numero")
     leia(numeros[i])
fimpara
limpatela

y <- 5

enquanto (y <= 5) e (y > 0)  faca
     para i de 1 ate 5 faca
          numerosInvertido[i] <- numeros[y]
          y <- y-1
          escreval(numerosInvertido[i])
     fimpara
fimenquanto

fimalgoritmo
