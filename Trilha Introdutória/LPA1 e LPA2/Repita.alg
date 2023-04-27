algoritmo "Repita"

var
senha, resposta: literal
i: inteiro
inicio
i <- 0
escreval("Informe a senha")
leia(senha)
limpatela

repita
escreval("Informe a senha para sair do programa")
leia(resposta)
i <- i + 1
ate (resposta = senha) ou (i >= 5)


fimalgoritmo
