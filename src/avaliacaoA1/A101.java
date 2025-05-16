package avaliacaoA1;

/*
A101) (0,5 pontos) A taxa de um estacionamento é de R$ 5,00 fixos mais R$ 3,00 por
hora de permanência. Faça um programa que leia a quantidade de horas que um
carro ficou estacionado e calcule o valor total a ser pago.
 */

import java.util.Scanner;

public class A101 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantidade de horas estacionado: ");
        int qtdeHorasEstacionado = scanner.nextInt();

        int totalPagar = 5 + ((qtdeHorasEstacionado - 1) * 3);

        System.out.printf("\nTotal a pagar: %d", totalPagar);
    }
}
