package DevDojo.Logica_de_programacao.Listas.VariaveisOperadoresAritmeticos;

import java.util.Scanner;

/**
 * C-)Em um circuito elétrico temos as seguintes informações:
 * 12 V e 175 Ω, calcule a corrente elétrica, utilizando a fórmula abaixo:
 * <p>
 * <p>
 * I=UR
 * <p>
 * Onde:
 * I = Corrente em Amperes
 * U = Tensão em Volts
 * R = Resistência em Ohms
 * <p>
 * <p>
 * BÔNUS: Altere o programa acima e permita que o usuário digite os valores
 * para Volts  e Ohms.
 */
public class LeiOhm3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Programa que Cálcula a Corrente elétrica utilizando a Lei de Ohm");


        System.out.println("Digite o valor da tensão");
        double tensao = scanner.nextDouble();

        System.out.println("Digite o valor da resistência");
        double resistencia = scanner.nextDouble();


        double corrente = tensao / resistencia;


        System.out.println(String.format("O valor da corrente é %.2f", corrente));
    }
}
