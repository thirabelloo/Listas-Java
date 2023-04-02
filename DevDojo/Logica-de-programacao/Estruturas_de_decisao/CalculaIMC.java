package DevDojo.Logica_de_programacao.Listas.EstruturasDeDecisao;

import java.util.Scanner;

/**
 * Exercicio 8
 * Desenvolva uma calculadora de IMC (Índice de Massa Corporal),
 * após realizado o cálculo classificar o paciente de acordo com a tabela abaixo.
 * <p>
 * <p>
 * Para realizar o cálculo de IMC utilize a fórmula abaixo:
 * IMC=PESO/ALTURA2
 */
public class CalculaIMC {
    public static void main(String[] args) {
        System.out.println("Programa que Calcula Índice de Massa Corporal(IMC)");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o seu peso");
        double peso = scanner.nextDouble();

        System.out.println("Informe a sua altura");
        double altura = scanner.nextDouble();

        double IMC = (peso / (altura * altura));

        if (IMC < 10) {
            System.out.println(String.format("Desnutrição Grau V %.2f", IMC));
        } else if (IMC > 10 && IMC <= 12.9) {
            System.out.println(String.format("Desnutrição Grau IV %.2f", IMC));
        } else if (IMC > 13 && IMC <= 15.9) {
            System.out.println(String.format("Desnutrição Grau III %.2f", IMC));
        } else if (IMC > 16 && IMC <= 16.9) {
            System.out.println(String.format("Desnutrição Grau II %.2f", IMC));
        } else if (IMC > 17 && IMC <= 18.4) {
            System.out.println(String.format("Desnutrição Grau I %.2f", IMC));
        } else if (IMC > 18.5 && IMC <= 24.9) {
            System.out.println(String.format("Normal %.2f", IMC));
        } else if (IMC > 25 && IMC <= 29.9) {
            System.out.println(String.format("Pré-obesidade %.2f", IMC));
        } else if (IMC > 30 && IMC <= 34.5) {
            System.out.println(String.format("Obesidade Grau I %.2f", IMC));
        } else if (IMC > 35 && IMC <= 39.9) {
            System.out.println(String.format("Obesidade Grau II %.2f", IMC));
        } else if (IMC > 40) {
            System.out.println(String.format("Obesidade Grau III %.2f", IMC));
        }

    }
}
