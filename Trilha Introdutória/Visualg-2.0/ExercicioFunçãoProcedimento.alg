algoritmo "Exercicio Função/Procedimento"

var

lado1, lado2, lado3: inteiro
procedimento lerDados()
inicio
      escreval("Lado 1: ")
      leia(lado1)
      escreval("Lado 2: ")
      leia(lado2)
      escreval("Lado 3: ")
      leia(lado3)
fimprocedimento

funcao ehTriangulo(): logico
inicio
      se (lado1>lado2+lado3) ou (lado2>lado1+lado3) ou (lado3>lado1+lado2) entao
          retorne falso
      senao
          retorne verdadeiro
      fimse
fimfuncao

funcao tipoTriangulo() : literal
inicio
      se (lado1 = lado2) e (lado2 = lado3) entao
         retorne "Equilátareo"
      senao
      se (lado1=lado2) ou (lado2=lado3) ou (lado1=lado3) entao
         retorne "Isóceles"
      senao
           retorne "Escaleno"
      fimse
      fimse
fimfuncao

inicio
      lerDados()
      se ehTriangulo() entao
         escreval(tipoTriangulo())
      senao
         escreval("Não é triangulo")
      fimse
fimalgoritmo
