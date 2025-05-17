package avaliacaoA1;

/*
A102) (1,0 ponto) O Índice de Massa Corporal (IMC) é calculado usando a fórmula:
 IMC = peso / (altura)^2. Ex: peso = 70, altura = 1.75 → IMC = 22.86
Faça um programa que leia o peso, a altura e o sexo da pessoa (M para
masculino, F para feminino) e retorne uma String indicando a condição
corporal, conforme a tabela padrão do IMC
*/

import java.util.Scanner;

public class A102 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Peso (kg): ");
        double peso = scanner.nextDouble();
        System.out.print("Altura (m): ");
        double altura = scanner.nextDouble();
        System.out.print("Sexo (M/F): ");
        char sexo = scanner.next().toUpperCase().charAt(0);

        double imc = peso / (altura * altura);

        String condicao = "Obesidade Mórbida";
        if (sexo == 'M'){
            if (imc < 20){
                condicao = "Abaixo do peso";
            } else if (imc < 25){
                condicao = "Normal";
            } else if (imc < 30){
                condicao = "Sobrepeso";
            } else if (imc < 40 ){
                condicao = "Obesidade";
            }
        } else if (sexo == 'F') {
            if (imc < 19){
                condicao = "Abaixo do peso";
            } else if (imc < 24){
                condicao = "Normal";
            } else if (imc < 29){
                condicao = "Sobrepeso";
            } else if (imc < 39 ){
                condicao = "Obesidade";
            }
        }

        System.out.printf("\nCondição %s para IMC %6.2f", condicao, imc);
    }
}
