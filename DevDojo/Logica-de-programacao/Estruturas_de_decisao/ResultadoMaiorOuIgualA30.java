package DevDojo.Logica_de_programacao.Listas.EstruturasDeDecisao;

import java.util.Scanner;

/**
 * Exercicio 6
 * Leia um número inteiro qualquer  e multiplique por 2,
 * apresentar o resultado da multiplicação  somente se o resultado for maior ou igual a 30
 */
public class ResultadoMaiorOuIgualA30 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println();

        System.out.println("Digite um número inteiro");
        int numeroInput = scanner.nextInt();

        int resultado = numeroInput * 2;

        if (resultado >= 30) {
            System.out.println("O resultado é: " + resultado);
        } else {
            System.out.println("O resultado digitado não atendeu a regra, tente novamente!");
        }
    }
}
