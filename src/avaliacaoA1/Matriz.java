package avaliacaoA1;

import java.util.Random;

public class Matriz {
    private final int[][] matriz;

    public Matriz(int dimensao) {
        this.matriz = new int[dimensao][dimensao];

        this.preencher();
    }

    private void preencher() {
        for (int lin = 0; lin < this.matriz.length; lin++){
            for (int col = 0; col < this.matriz[lin].length; col++){
                this.matriz[lin][col] = this.getNumeroAleatorio();
            }
        }
    }

    private int getNumeroAleatorio() {
        Random random = new Random();

        return random.nextInt(200);
    }

    public void imprimirMedia() {
        int media = this.getMedia();

        System.out.printf("\nA média da matriz é: %d", media);
    }

    private int getMedia() {
        int total = this.getTotal(),
                tamanho = this.getTamanho();

        int media = total / tamanho;

        return media;
    }

    private int getTamanho() {
        return this.matriz.length * this.matriz.length;
    }

    private int getTotal() {
        int total = 0;

        for (int lin = 0; lin < this.matriz.length; lin++){
            for (int col = 0; col < this.matriz[lin].length; col++){
                total += this.matriz[lin][col];
            }
        }

        return total;
    }

    public void imprimir() {
        this.imprimirCabecalho();
        for (int lin = 0; lin < this.matriz.length; lin++){
            System.out.printf("\n%6d ", lin);
            for (int col = 0; col < this.matriz[lin].length; col++){
                System.out.printf("%6d ", this.matriz[lin][col]);
            }
        }
    }

    private void imprimirCabecalho() {
        System.out.printf("%6s ", "M");
        for (int pos = 0; pos < this.matriz.length; pos++) {
            System.out.printf("%6d ", pos);
        }
    }
}
