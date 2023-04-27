algoritmo "Menu"

var
opcaoMenu: literal
totalConta: inteiro
inicio
totalConta <- 0

repita
    escreval("1 - Troca de óleo")
    escreval("2 - Balaciamento")
    escreval("3 - Sair")
    leia(opcaoMenu)
    se opcaoMenu = "1" entao
        totalConta <- totalConta + 100
    senao
    se opcaoMenu = "2" entao
        totalConta <- totalConta + 70
    fimse
    fimse
    
    limpatela
ate opcaoMenu = "3"
escreval("Total Conta: ", totalConta)

fimalgoritmo
