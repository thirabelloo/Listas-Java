package DevDojo.Logica_de_programacao.Listas.VariaveisOperadoresAritmeticos;

import java.util.Scanner;

/** B-) Em um circuito elétrico temos as seguintes informações:
 275 Ω e 1 A, calcule a tensão elétrica, utilizando a fórmula abaixo:

 U=RI

 Onde:
 U = Tensão em Volts
 R = Resistência em Ohms
 I = Corrente em Amperes

 BÔNUS: Altere o programa acima e permita que o usuário digite os valores
 para Ohms  e Amperes.
 */
public class LeiOhm2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Programa que Cálcula a Tensão utilizando a Lei de Ohm");


        System.out.println("Digite o valor da resistência");
        double resistencia = scanner.nextDouble();

        System.out.println("Digite o valor da corrente");
        double corrente = scanner.nextDouble();

        double tensao =  resistencia * corrente;

        System.out.println(String.format("O valor da tensão é %.2f", tensao));

    }
}
