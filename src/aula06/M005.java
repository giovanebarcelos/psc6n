package aula06;

/*
M005 Dado uma matriz de ordem 4x4 faça um algoritmo que:
a) Calcule a soma dos elementos da primeira coluna ;
b) Calcule o produto dos elementos da primeira linha;
c) Calcule a soma de todos os elementos da matriz;
d) Calcule a soma do diagonal principal;
e) Calcule a soma da diagonal secundária.
*/

public class M005 {
    public static void main(String[] args) {
        Matriz matriz = new Matriz(4, 4);

        matriz.imprimir();
        matriz.imprimirEstatisticas();
    }
}
