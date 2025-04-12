package aula08;

/*
M022 Faça um algoritmo que armazene números em um vetor,
verificar e escrever se existem números repetidos no vetor e
em que posições se encontram.
*/

public class M022 {
    public static void main(String[] args) {
        int[] numeros = {10,9,6,3,10,13,9,10};
        boolean[] visitado = new boolean[numeros.length];

        for (int pos = 0; pos < numeros.length; pos++){
            visitado[pos] = true;
            boolean imprimiu = false;
            for (int ref = 0; ref < numeros.length; ref++){
                if (numeros[pos] == numeros[ref] && !visitado[ref]){
                    if (!imprimiu){
                        System.out.printf("%d = %d ", numeros[pos], pos);
                        imprimiu = true;
                    }

                    System.out.printf("%d ", ref);

                    visitado[ref] = true;
                }
            }
            System.out.println();
        }
    }
}
