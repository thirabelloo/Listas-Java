package DevDojo.Logica_de_programacao.Listas;

/**
 * Exercicio 10
 * Fazer a leitura de um valor numérico inteiro e apresentar o valor do número elevado ao quadrado, ao cubo e a 10,
 * apresentar também a soma total dos três resultados anteriores.
 */

import java.util.Scanner;

public class ValorElevadoMaisSoma {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.println("Programa número elevado");

        System.out.println("Informe um número");
        int numero = leitor.nextInt();

        double numeroElevadoQuadrado = Math.pow(numero, 2);
        double numeroElevadoCubo = Math.pow(numero, 3);
        double numeroElevadoDez = Math.pow(numero, 10);

        double total = numeroElevadoQuadrado + numeroElevadoCubo + numeroElevadoDez;

        System.out.println("O valor do número ao quadrado é " + Math.pow(numero, 2));
        System.out.println("O valor do número ao cubo é " + Math.pow(numero, 3));
        System.out.println("O valor do número  elevado a 10 é " + Math.pow(numero, 10));
        System.out.println("O total da soma é " + total);

    }
}

