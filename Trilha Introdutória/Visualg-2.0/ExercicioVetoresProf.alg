algoritmo "ExercicioVetoresProf"

var
numeros, numerosReverso: vetor[1..10] de inteiro
i,aux: inteiro

inicio

para i de 1 ate 10 faca
     escreval("Informe um numero")
     leia(numeros[i])
fimpara

aux <- 11

para i de 1 ate 10 faca
     numerosReverso[aux - i] <- numeros[i]
fimpara

fimalgoritmo
