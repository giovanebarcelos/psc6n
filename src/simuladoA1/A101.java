package simuladoA1;

import java.util.Scanner;

/*
A101) (0,5 pontos) Embrulhar um presente de aniversário custa X reais.
O presente de aniversário custa Y reais a mais que o preço para embrulhá-lo.
Quanto custará para comprar e embrulhar o presente?
Faça um programa que responda automaticamente a questão apresentada.
O valor X e Y do problema devem ser lidos e são valores reais
 */

public class A101 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do presente: ");
        float presente = scanner.nextFloat();
        System.out.print("Digite o valor do embrulho: ");
        float embrulho = scanner.nextFloat();

        System.out.printf("\nValor total do presente = %10.2f",
                presente + embrulho);
    }
}
