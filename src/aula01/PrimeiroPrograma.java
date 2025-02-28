package aula01;

import java.util.Scanner;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        System.out.printf("Meu Primeiro Programa");

        String nome;
        int idade;
        Scanner scanner = new Scanner(System.in);

        System.out.printf("\nNome: ");
        nome = scanner.nextLine();
        System.out.printf("Idade: ");
        idade = scanner.nextInt();

        System.out.printf("\nNome: " + nome+
                          "; idade: " + idade);

        imprimirDobroIdade(idade);

        int novaIdade = multiplicarIdade(idade, 2);
        System.out.printf("\nNova Idade = " + novaIdade);

    }

    private static int multiplicarIdade(int idade, int multiplicador) {
        int novaIdade = idade * multiplicador;

        return novaIdade;
    }

    private static void imprimirDobroIdade(int idade) {
        int dobroIdade = idade * 2;

        System.out.printf("\nO dobro da idade é " + dobroIdade);
    }
}
