package aula05;

public class M013 {
    private final int numero;

    public M013(int numero) {
        this.numero = numero;
    }

    public int[] getVetorMultiplicado(int[] vetor) {
        int[] novoVetor = new int[vetor.length];

        for (int pos = 0; pos < vetor.length; pos++){
            novoVetor[pos] = vetor[pos] * this.numero;
        }

        return novoVetor;
    }

    public void imprimir(int[] vetor){
        int pos = 0;

        while (pos < vetor.length){
            System.out.print(vetor[pos] + " ");

            pos++;
        }
    }

}
