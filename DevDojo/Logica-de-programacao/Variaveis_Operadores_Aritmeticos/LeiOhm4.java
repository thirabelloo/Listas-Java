package DevDojo.Logica_de_programacao.Listas.VariaveisOperadoresAritmeticos;

import java.util.Scanner;

/**D-)Ainda podemos realizar o cálculo de potência elétrica, desenvolva um rotina que calculo a potência de um equipamento, utilizando os dados e a fórmula a seguir:

 Dados:
 220 V  e 25 A

 Fórmula:
 P=UI

 Onde:
 P = Potência em Watts
 U  = Tensão em Volts
 I = Corrente em Amperes

 BÔNUS: Altere o programa acima e permita que o usuário digite os valores
 para Volts  e Amperes.
 *
 */
public class LeiOhm4 {
    public static void main(String[] args) {

        System.out.println("Programa que Cálcula a Potência elétrica utilizando a Lei de Ohm");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da tensão");
        double tensao = scanner.nextDouble();

        System.out.println("Digite o valor da corrente");
        double corrente = scanner.nextDouble();


        double potencia = tensao * corrente;


        System.out.println(String.format("O valor da potência é %.2f", potencia));
    }
}
