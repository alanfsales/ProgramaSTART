algoritmo "Enquanto 3"

var
   qtdEntrevistados, maisNovo, maisVelho, idadeInformada: inteiro
   mediaIdade, porcentageMenorIdade, qtdMenoresIdade, somaIdades: real

inicio
maisNovo <- 9999
maisVelho <- 0
qtdEntrevistados <- 0
qtdMenoresIdade <- 0

enquanto qtdEntrevistados < 5 faca
    escreval("Informe sua idade: ")
    leia(idadeInformada)
    
    se idadeInformada >= maisVelho entao
       maisVelho <- idadeInformada
    fimse
    
    se idadeInformada <= maisNovo entao
       maisNovo <- idadeInformada
    fimse
    
    se idadeInformada < 18 entao
       qtdMenoresIdade <- qtdMenoresIdade + 1
    fimse
    
    somaIdades <- somaIdades + idadeInformada
    qtdEntrevistados <- qtdEntrevistados + 1
fimenquanto

escreval("Mais Novo ", maisNovo)
escreval("Mais Velho ", maisVelho)
porcentageMenorIdade <- (qtdMenoresIdade / 5)*100
escreval("Porcentagem menor idade ", porcentageMenorIdade,"%")
mediaIdade <- somaIdades /5
escreval("Media da idade ", mediaIdade)

fimalgoritmo
