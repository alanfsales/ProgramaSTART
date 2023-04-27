algoritmo "MOD e DIV"

var
   x,y,w: inteiro
   
inicio
   x <- 10
   y <- 3
   //w <- x DIV y
   //w <- x mod y
   w <- x % y
   Escreval(w)
   Escreval("===============")
   Escreval("informe um numero")
   leia(x)
   
   se x % 2 = 0 entao
      Escreval("Numero Par")
   senao
      Escreval("Numero impar")
   fimse

fimalgoritmo
