package aula04;

public class M006 {
    public boolean ehSimetrica(int[][] matriz) {
        boolean simetrica = true;

        for (int i = 0; i <= 2; i++){
            for (int j = 0; j <= 2; j++){
                simetrica = simetrica && matriz[i][j] == matriz[j][i];
            }
        }

        return simetrica;
    }
}
