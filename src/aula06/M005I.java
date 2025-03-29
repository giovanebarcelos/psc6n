package aula06;

/*
M005 Dado uma matriz de ordem 4x4 faça um algoritmo que:
a) Calcule a soma dos elementos da primeira coluna ;
b) Calcule o produto dos elementos da primeira linha;
c) Calcule a soma de todos os elementos da matriz;
d) Calcule a soma do diagonal principal;
e) Calcule a soma da diagonal secundária.
 */
public class M005I {
    public static void main(String[] args) {
        int[][] matriz = {{1,2,3,4}, {5,6,7,8},
                {9,10,11,12}, {13,14,15,16}};

        int somaElementosPrimeiraColuna = 0,
                produtoElementosPrimeiraLinha = 1,
                somaTodosElementos = 0,
                somaDiagonalPrincipal = 0,
                somaDiagonalSecundaria = 0;

        for (int linha = 0; linha < matriz.length; linha++){
            for (int coluna = 0; coluna < matriz.length; coluna++){
                if (coluna == 0) somaElementosPrimeiraColuna += matriz[linha][coluna];
                if (linha == 0) produtoElementosPrimeiraLinha *= matriz[linha][coluna];
                somaTodosElementos += matriz[linha][coluna];
                if (linha == coluna) somaDiagonalPrincipal += matriz[linha][coluna];
                if (linha + coluna == 3) somaDiagonalSecundaria += matriz[linha][coluna];
            }
        }

        System.out.println("a) Soma dos elementos da primeira coluna: " +
                somaElementosPrimeiraColuna);
        System.out.println("b) Produto dos elementos da primeira linha: " +
                produtoElementosPrimeiraLinha);
        System.out.println("c) Soma de todos os elementos da matriz: " +
                somaTodosElementos);
        System.out.println("d) Soma do diagonal principal: " +
                somaDiagonalPrincipal);
        System.out.println("e) Soma da diagonal secundária: " +
                somaDiagonalSecundaria);
    }
}
