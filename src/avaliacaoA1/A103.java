package avaliacaoA1;

/*
A103) (1,5 ptos) Escreva um programa que leia dois números inteiros:
 um número base e um limite superior. Mostre todos os múltiplos do número base que são menores
ou iguais ao limite.
Ex: base = 4, limite = 20 Saída: 4 8 12 16 20 →

 */

import java.util.Scanner;

public class A103 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Número base: ");
        int numeroBase = scanner.nextInt();
        System.out.print("Limite Superior: ");
        int limiteSuperior = scanner.nextInt();

        int numero = numeroBase;
        while (numero <= limiteSuperior ){
            System.out.printf("%d ", numero);
            numero += numeroBase;
        }
    }
}
