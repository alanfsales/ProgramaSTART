algoritmo "Matriz"

var
cinema: vetor[1..10,1..10] de literal
i,j,fila,poutrona: inteiro
opcao: literal
inicio
para i de 1 ate 10 faca
     para j de 1 ate 10 faca
          cinema[i,j] <- "0"
     fimpara
fimpara

repita
      escreval("1 - Reservar")
      escreval("2 - Layout do cinema")
      escreval("3 - Sair")
      leia(opcao)
      
      escolha opcao
          caso "1"
               limpatela
               escreval("Fila")
               leia(fila)
               escreval("Poutrona")
               leia(poutrona)
               limpatela
               
               se cinema[fila, poutrona] = "0" entao
                   cinema[fila, poutrona] <- "X"
               senao
                    limpatela
                    escreval("Poutrona ocupada")
                    escreval("")
               fimse
          caso "2"
               limpatela
               para i de 1 ate 10 faca
                     para j de 1 ate 10 faca
                           escreva(" ", cinema[i,j], " ")
                     fimpara
                     escreval("")
               fimpara
          
      fimescolha
ate opcao = "3"

fimalgoritmo
