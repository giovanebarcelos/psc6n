package simuladoA1;

import java.util.Scanner;

public class A102 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Circunferência do quadril (cm): ");
        double circunferenciaQuadril = scanner.nextFloat();
        System.out.print("Altura (m): ");
        double altura = scanner.nextFloat();
        System.out.print("Sexo (M/F): ");
        String sexo = scanner.next();

        double iac = getIAC(circunferenciaQuadril, altura);
        String classificacaoIAC = getClassificacaoIAC( iac, sexo );

        System.out.printf("\nTu estás com a classificação no IAC %s\n",
                classificacaoIAC);
    }

    private static String getClassificacaoIAC(double iac, String sexo) {
        String classificacao = "";
        if ("M".equals(sexo)){
            if (iac < 8.0) {
                classificacao = "Abaixo do peso";
            } else if (iac <= 20.0) {
                classificacao = "Normal";
            } else if (iac <= 25.0) {
                classificacao = "Sobrepeso";
            } else {
                classificacao = "Obsidade";
            }
        } else {
            classificacao = iac < 8.0 ? "Abaixo do peso" :
                                iac <= 20.0 ?  "Normal" :
                                        iac <= 25.0 ? "Sobrepeso" :
                                                "Obsidade";
        }

        return classificacao;
    }

    private static double getIAC(double circunferenciaQuadril, double altura) {
        return ( circunferenciaQuadril / ( altura * Math.sqrt(altura)) ) - 18.0;
    }
}
