package aula06;

public class Matriz {
    private int[][] matriz;
    public Matriz(int linha, int coluna) {
        this.matriz = new int[linha][coluna];
        this.preencherMatriz();
    }

    private void preencherMatriz() {
        int numero = 1;
        for (int linha = 0; linha < this.matriz.length; linha++){
            for (int coluna = 0; coluna < this.matriz.length; coluna++){
                this.matriz[linha][coluna] = numero;
                numero++;
            }
        }
    }

    public void imprimir() {
        System.out.printf("%8s %6d %6d %6d %6d", "Matriz", 0, 1, 2, 3);
        for (int linha = 0; linha < this.matriz.length; linha++){
            System.out.printf("\n%8d", linha);
            for (int coluna = 0; coluna < this.matriz.length; coluna++){
                System.out.printf(" %6d", this.matriz[linha][coluna]);
            }
        }
    }

    public void imprimirEstatisticas() {
        System.out.println("\n\na) Soma dos elementos da primeira coluna: " +
                this.getSomaElementosPrimeiraColuna());
        System.out.println("b) Produto dos elementos da primeira linha: " +
                this.getProdutoElementosPrimeiraLinha());
        System.out.println("c) Soma de todos os elementos da matriz: " +
                this.getSomaTodosElementos());
        System.out.println("d) Soma do diagonal principal: " +
                this.getSomaDiagonalPrincipal());
        System.out.println("e) Soma da diagonal secundária: " +
                this.getSomaDiagonalSecundaria());
    }

    private int getSomaDiagonalSecundaria() {
        int somaDiagonalSecundaria = 0;
        for (int linha = 0; linha < this.matriz.length; linha++){
            for (int coluna = 0; coluna < this.matriz.length; coluna++){
                if (linha + coluna == 3){
                    somaDiagonalSecundaria += this.matriz[linha][coluna];
                }
            }
        }
        return somaDiagonalSecundaria;
    }

    private int getSomaDiagonalPrincipal() {
        int somaDiagonalPrincipal = 0;

        for (int linha = 0; linha < this.matriz.length; linha++){
            somaDiagonalPrincipal += this.matriz[linha][linha];
        }

        return somaDiagonalPrincipal;
    }

    private int getSomaTodosElementos() {
        int somaTodosElementos = 0;

        int linha = 0;
        while (linha < this.matriz.length){
            int coluna = 0;
            while (coluna < this.matriz.length){
                somaTodosElementos += this.matriz[linha][coluna];
                coluna++;
            }
            linha++;
        }

        return somaTodosElementos;
    }

    private int getProdutoElementosPrimeiraLinha() {
        int produtoPrimeiraLinha = 1;

        for (int coluna = 0; coluna < this.matriz.length; coluna++){
            produtoPrimeiraLinha *= this.matriz[0][coluna];
        }

        return produtoPrimeiraLinha;
    }

    private int getSomaElementosPrimeiraColuna() {
        int somaPrimeiraColuna = 0;

        for (int linha = 0; linha < this.matriz.length; linha++){
            somaPrimeiraColuna += this.matriz[linha][0];
        }

        return somaPrimeiraColuna;
    }

    public void imprimirMedia() {
    }
}
