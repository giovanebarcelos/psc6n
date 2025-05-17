package avaliacaoA1;

/*
A105) (1,5 ptos) Verifique se um número é perfeito. Um número é perfeito quando a
soma de seus divisores próprios (excluindo ele mesmo) é igual ao próprio
número. Ex: 6 divisores: 1, 2, 3 -> 1 + 2 + 3 = 6 número perfeito
*/

import java.util.Scanner;

public class A105 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Número positivo inteiro: ");
        int numero = scanner.nextInt();

        int somaDivisores = 0,
                divisor = 1;

        while (divisor < numero){
            if (numero % divisor == 0){
                somaDivisores += divisor;
            }

            divisor++;
        }

        if (numero == somaDivisores){
            System.out.printf("\nNúmero %d é perfeito!", numero);
        } else {
            System.out.printf("\nNúmero %d não é perfeito!", numero);
        }
    }
}
