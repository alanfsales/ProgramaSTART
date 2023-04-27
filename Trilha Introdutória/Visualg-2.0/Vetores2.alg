algoritmo "Vetores2"

var
nomes: vetor[1..5] de literal
pesquisa: literal
i,sucesso: inteiro

inicio

para i de 1 ate 5 faca
     escreval("Informe seu nome")
     leia(nomes[i])
fimpara
limpatela

escreval("Informe um nome a pesquisar")
leia(pesquisa)

sucesso <- 0

para i de 1 ate 5 faca
     se nomes[i] = pesquisa entao
        sucesso <- 1
     fimse
fimpara

se sucesso = 1 entao
   escreval("Cliente encontrado")
senao
     escreval("Cliente não encontrado")
fimse

fimalgoritmo
