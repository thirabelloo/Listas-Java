package DevDojo.Logica_de_programacao.Listas.EstruturasDeDecisao;

import java.util.Scanner;

/**Exercicio 1
 * Desenvolva um rotina que leia as notas de quatro bimestres de um aluno (N1, N2, N3 e N4),
 * e informe o status do aluno baseado na tabela abaixo:
 * <p>
 * Se a média for menor que 50 REPROVADO
 * Se a média for igual a 50 RECUPERAÇÃO
 * Se a média for maior que 50 APROVADO
 */
public class MediaAluno {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Programa Média Aluno\n");

        double notaN1 = entradaDeDados(leitor, "Informe a nota N1");
        double notaN2 = entradaDeDados(leitor, "Informe a nota N2");
        double notaN3 = entradaDeDados(leitor, "Informe a nota N3");
        double notaN4 = entradaDeDados(leitor, "Informe a nota N4");
        double alunoMedia = calcularMedia(notaN1, notaN2, notaN3, notaN4);

    }

    public static double calcularMedia(double num1, double num2, double num3, double num4) {

        double media = (num1 + num2 + num3 + num4) / 4;

        if (media >= 0 && media < 50) {
            System.out.println("Aluno Reprovado " + media);
        } else if (media == 50) {
            System.out.println("Aluno Recuperação " + media);
        } else if (media > 50 && media <= 100) {
            System.out.println("Aluno Aprovado " + media);
        } else {
            System.out.println("Média inválida, tente novamente ");
        }
        return media;
    }

    public static double entradaDeDados(Scanner sc, String mensagem) {
        System.out.println(mensagem);
        return sc.nextDouble();
    }
}

