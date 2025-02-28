package aula02;

/*
R008 Escreva um algoritmo que leia um valor inteiro,
calcule e mostre o seu fatorial.

 */

import java.util.Scanner;

public class R008 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        System.out.print("Número: ");
        numero = scanner.nextInt();

        int fatorial = getFatorial(numero);
        System.out.println("Fatorial For = " + fatorial);

        fatorial = getFatorialWhile(numero);
        System.out.println("Fatorial While = "+ fatorial);
    }

    private static int getFatorialWhile(int numero) {
        int fatorial = 1;
        int multiplicador = 1;
        while (multiplicador <=  numero){
            fatorial = fatorial * multiplicador;
            multiplicador++;
        }
        return fatorial;
    }

    private static int getFatorial(int numero) {
        int fatorial = 1;
        for (int multiplicador = 1; multiplicador <= numero; multiplicador++){
            fatorial = fatorial * multiplicador;
        }
        return fatorial;
    }
}
