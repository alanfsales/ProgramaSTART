algoritmo "Exercicio Função/Procedimento"

var
opcaoMenu : literal
clientes : vetor[1..5] de literal

procedimento  mostrarMenu()
inicio
   escreval("1 - Cadastrar")
   escreval("2 - Pesquisar")
   escreval("3 - Excluir")
   escreval("4 - Sair")
      leia(opcaoMenu)
fimprocedimento

procedimento  cadastrar()
var
   i: inteiro
inicio

   para i de 1 ate 5 faca
        se clientes[i] = "" entao
           escreval("Informe o nome do cliente")
           leia(clientes[i])
        fimse
   fimpara
fimprocedimento

procedimento  pesquisar()
var
   i, indiceSucesso: inteiro
   nomeAPesquisar: literal
inicio
   escreval("Informe o nome do cliente a pesquisar")
   leia(nomeAPesquisar)
   indiceSucesso <- -1
   
   para i de 1 ate 5 faca
        se clientes[i] = nomeAPesquisar entao
           indiceSucesso <- i
           interrompa
        fimse
   fimpara
   
   se indiceSucesso = -1 entao
       escreval("cliente não encontrado")
   senao
       escreval("cliente encontrado na posição ", indiceSucesso)
   fimse
fimprocedimento

procedimento  excluir()
var
   indiceExclusao: inteiro
inicio
   escreval("Informe indice a excluir")
   leia(indiceExclusao)

   se (indiceExclusao > 5) ou (indiceExclusao < 1) entao
       escreval("Indice inválido")
   senao
       clientes[indiceExclusao] <- ""
   fimse
fimprocedimento

inicio

repita
      mostrarMenu()
      escolha opcaoMenu
         caso "1"
              cadastrar()
         caso "2"
              pesquisar()
         caso "3"
              excluir()
         outrocaso
             escreval("opcão inválida")
         fimescolha
ate opcaoMenu = "4"

fimalgoritmo
