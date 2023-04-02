package DevDojo.Logica_de_programacao.Listas.EstruturasDeDecisao;

import java.util.Scanner;

/**
 * Exercicio 5
 * Desenvolva um programa que execute a leitura de um valor numérico inteiro, caso o valor esteja entre 1 e 9 apresentar
 * a mensagem “Dentro do valor permitido”e caso contrário apresentar a mensagem  “Fora do Valor Permitido”.
 */
public class NumeroDentroDoValorPermitido {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero");
        int numeroInput = scanner.nextInt();

        if (numeroInput >= 1 && numeroInput <= 9) {
            System.out.println("Dentro do valor permitido");
        } else {
            System.out.println("Fora do valor permitido");
        }

    }
}
