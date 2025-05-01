package simuladoA1;

/*
A104) (1,5 ptos) Escreva um algoritmo que leia uma matriz quadrada de
sétima ordem M(7,7), 7 linhas e 7 colunas, e efetue a soma dos elementos
da diagonal principal (canto superior esquerdo ao canto
inferior direito). Depois de calculado mostre a soma na tela
 */

public class A104 {
    public static void main(String[] args) {
        int[][] matriz = { {1,2,3,4,5,6,7}, {1,2,3,4,5,6,7}, {1,2,3,4,5,6,7},
                {1,2,3,4,5,6,7}, {1,2,3,4,5,6,7}, {1,2,3,4,5,6,7}, {1,2,3,4,5,6,7}};

        int somaDiagonalPrincipal = getSomaDiagonalPrincipal(matriz);

        System.out.printf("A soma da diagonal principal é %d",
                somaDiagonalPrincipal);
    }

    private static int getSomaDiagonalPrincipal(int[][] matriz) {
        int soma = 0;

        for (int linha = 0; linha < matriz.length; linha++){
            for (int coluna = 0; coluna < matriz.length; coluna++){
                if ( linha == coluna){
                    soma += matriz[linha][coluna];
                }
            }
        }

        return soma;
    }
}
