package avaliacaoA1;

/*
A104) (1,5 ptos) Escreva um algoritmo que leia ou preencha de qualquer forma uma
matriz quadrada de terceira ordem M(3,3), 3 linhas e 3 colunas, e faça a média de
todos os valores desta matriz. Depois de calculado mostre a média da matriz. A
média é a soma de todos os elementos dividido pela quantidade de posições da
matriz. Ex: matriz = {{1,2,3},{1,2,3},{1,2,3}} Total = 18, portanto a média é →
18/9 = 2
*/

import avaliacaoA1.Matriz;

public class A104 {
    public static void main(String[] args) {
        Matriz matriz = new Matriz(9);

        matriz.imprimir();
        matriz.imprimirMedia();
    }
}
