package aula07;

import java.util.Scanner;

/*
M007 Dado uma matriz quadrada de ordem 3 de valores reais faça um algoritmo
que faça a leitura destes valores e ao final da leitura de todos,
imprimirem os seguintes relatórios:
a) Qual a Soma dos valores de cada coluna da matriz;
b) Listar os valores que são menores que a média dos valores;
c) Qual a soma dos elementos da diagonal secundária;

Author: Rafaela Acosta
*/
public class M007 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] matriz = new double[3][3];
        double somaDiagonalSecundaria = 0;
        double somaTotal = 0;

        System.out.println("Digite os valores para a matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Posição [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextDouble();
                somaTotal += matriz[i][j];
                if (i + j == 2) { // Condição para diagonal secundária
                    somaDiagonalSecundaria += matriz[i][j];
                }
            }
        }

        System.out.println("\nSoma dos valores de cada coluna:");
        for (int j = 0; j < 3; j++) {
            double somaColuna = 0;
            for (int i = 0; i < 3; i++) {
                somaColuna += matriz[i][j];
            }
            System.out.println("Coluna " + (j + 1) + ": " + somaColuna);
        }


        double media = somaTotal / 9; // Total de elementos na matriz é 3x3
        System.out.println("\nValores menores que a média (" + media + "):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] < media) {
                    System.out.println("Posição [" + i + "][" + j + "]: " + matriz[i][j]);
                }
            }
        }

        System.out.println("\nSoma dos elementos da diagonal secundária: " + somaDiagonalSecundaria);

    }
}
