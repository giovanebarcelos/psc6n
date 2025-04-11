package aula08;

/*
M015 Faça um algoritmo que  armazene em um vetor a temperatura
 média de todos os dias de um mês escolhido.
Calcular e escrever:
a) Menor temperatura do mês
b) Maior temperatura do mês
c) Temperatura média mensal
d) O número de dias no mês em que a temperatura foi inferior
a média mensal
 */

import java.util.Random;

public class M015 {
    public static void main(String[] args) {
        int[] temperaturas = new int[30];

        temperaturas = getTemperaturas(temperaturas.length);
        int menorTemperaturaDoMes = getMenorTemperaturaDoMes(temperaturas);
        int maiorTemperaturaDoMes = getMaiorTemperaturaDoMes(temperaturas);
        int temperaturaMediaMensal = getTemperaturaMediaMensal(temperaturas);
        int diasMesTemperaturaInferiorAMediaMensal =
                getDiasMesTemperaturaInferiorAMediaMensal(temperaturas,
                        temperaturaMediaMensal);

        System.out.printf("Menor temperatura do mês: %d\n", menorTemperaturaDoMes);
        System.out.printf("Maior temperatura do mês: %d\n", maiorTemperaturaDoMes);
        System.out.printf("Temperatura média mensal: %d\n", temperaturaMediaMensal);
        System.out.printf("Dias do mês com temperatura inferior a média mensal: %d\n",
                diasMesTemperaturaInferiorAMediaMensal);
    }

    private static int getDiasMesTemperaturaInferiorAMediaMensal(int[] temperaturas,
                                                                 int temperaturaMediaMensal) {
        int diasDiasMesTemperaturaInferiorAMediaMensal = 0;

        for (int temperatura: temperaturas){
            if (temperatura < temperaturaMediaMensal){
                diasDiasMesTemperaturaInferiorAMediaMensal++;
            }
        }

        return diasDiasMesTemperaturaInferiorAMediaMensal;
    }

    private static int getTemperaturaMediaMensal(int[] temperaturas) {
        int totalTemperaturasMes = 0;

        for (int temperatura: temperaturas){
            totalTemperaturasMes += temperatura;
        }

        return totalTemperaturasMes / temperaturas.length;
    }

    private static int getMaiorTemperaturaDoMes(int[] temperaturas) {
        int maiorTemperatura = temperaturas[0];

        for (int dia = 1; dia < temperaturas.length; dia++){
            if (maiorTemperatura < temperaturas[dia]){
                maiorTemperatura = temperaturas[dia];
            }
        }
        return maiorTemperatura;
    }

    private static int getMenorTemperaturaDoMes(int[] temperaturas) {
        int menorTemperatura = temperaturas[0];

        int dia = temperaturas.length - 1;
        while (dia > 0){
            if (menorTemperatura > temperaturas[dia]){
                menorTemperatura = temperaturas[dia];
            }
            dia--;
        }

        return menorTemperatura;
    }

    private static int[] getTemperaturas(int qtdeDias) {
        Random random = new Random();
        int temperaturaMin = 10, temperaturaMax = 50;

        int[] temperaturas = new int[qtdeDias];

        for (int dia = 0; dia < qtdeDias; dia++){
            temperaturas[dia] = random.nextInt(
                    temperaturaMax - temperaturaMin) + temperaturaMin;
        }

        return temperaturas;
    }
}
