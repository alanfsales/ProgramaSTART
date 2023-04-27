algoritmo "Estrutura Condicional"

var
   nota1, nota2, nota3, media: real
inicio
   Escreval("Informe a Nota 1: ")
   leia(nota1)
   Escreval("Informe a Nota 2: ")
   leia(nota2)
   Escreval("Informe a Nota 3: ")
   leia(nota3)
   
   media <- (nota1 + nota2 + nota3)/3
   
   se media < 7 entao
      Escreval("Você está de recuperação")
   senao
      Escreval("Você passou!")
   fimse
fimalgoritmo
