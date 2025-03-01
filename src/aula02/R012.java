package aula02;
/*
R012 Elabore um algoritmo para calcular e imprimir a
média aritmética dos números inteiros positivos ímpares inferiores
ou iguais a um número N lido inicialmente.
 */

import java.util.Scanner;

public class R012 {
    public static void main(String[] args) {
        int numero = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Número: ");
        numero = scanner.nextInt();

        float media = media(numero);

        System.out.printf("Média do número %d é %f ",
                numero, media);
    }

    private static float media(int numero) {
        float soma = 0;
        int contador = 0;

        for (int seq = 1; seq <= numero; seq++){
            if (seq % 2 != 0){
                soma += seq;
                contador++;
            }
        }

        return soma / contador;
    }
}
