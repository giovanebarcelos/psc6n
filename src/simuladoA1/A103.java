package simuladoA1;

/*
A103) (1,5 ptos) Escreva um programa que leia um valor inteiro,
calcule e mostre o seu fatorial. Fatorial de um número natural n,
representado por n!, é o produto de todos os inteiros positivos menores ou
iguais a n. Exemplo: 3! = 6, ou seja, 1 x 2 x 3 = 6.
 */

import java.util.Scanner;

public class A103 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();

        int fatorialFor = getFatorialFor( numero );
        int fatorialWhile = getFatorialWhile( numero );

        System.out.printf("\nO fatorial while do número %d é %d e for é %d",
                numero, fatorialWhile, fatorialFor);
    }

    private static int getFatorialFor(int numero) {
        int fatorial = 1;

        for (int multiplicador = 1; multiplicador <= numero; multiplicador++){
            fatorial *= multiplicador;
        }

        return fatorial;
    }

    private static int getFatorialWhile(int numero) {
        int fatorial = 1;
        int multiplicador = 1;

        while (multiplicador <= numero){
            fatorial *= multiplicador;
            multiplicador++;
        }

        return fatorial;
    }
}
