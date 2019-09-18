# Programação Orientada a Objetos - Trabalho 1

* Classe Controle
  1. Contém o método main com os seguintes passos:
      1. Imprime a cor do semáforo
      1. Repete 10 vezes as seguintes operações:
          1. Muda a cor atual do semáforo para a próxima cor
          1. Imprime a cor do semáforo
      1. Fixa a cor do semáforo em amarelo
      1. Imprime a cor do semáforo

* Classe Semaforo
    1. Atributo: 
        * cor, representada com um valor inteiro ==>0 (verde), 1 (amarelo) ou 2 (vermelho), sendo o valor inicial igual a 2.

    1. Métodos:
        1. MudaProximaCor: sem parâmetros e sem retorno ==> muda a cor atual do semáforopara a próxima cor(se estiver verde, fica amarelo; se estiver amarelo, fica vermelho; se estiver vermelho, fica verde).
        1. MudaCorFixa: com parâmetro inteiro, sem retorno ==> muda a cor atual do semáforo para a cor fornecida como parâmetro.
        1. MostraCor: sem parâmetro, com retorno inteiro ==> retorna a cor atual do semáforo.
