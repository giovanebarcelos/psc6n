package aula05;

/*
M013 Ler um vetor A de 15 números. Após, ler mais um
número e guardar em uma variável X.
Armazenar em um vetor M o resultado de cada elemento de
A multiplicado pelo valor X.
Logo após, imprimir o vetor M.
 */

public class M013App {
    public static void main(String[] args) {
        int[] vA = {3,9,6,5,8};
        int numero = 9;

        M013 vetor = new M013(numero);

        int[] vM = vetor.getVetorMultiplicado(vA);

        vetor.imprimir(vM);
    }
}
