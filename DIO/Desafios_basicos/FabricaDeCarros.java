package Dio.Desafios_Basicos;

import java.util.Scanner;

/**
 * Desafio 01
 * O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
 * O gerente de uma loja de carros gostaria de um programa para calcular o preço de um carro novo para os clientes.
 * Você receberá o custo de fábrica e as porcentagens referentes ao distribuidor e os impostos e deverá escrever programa para ler esses valores e imprimir o valor final do carro.
 */
public class FabricaDeCarros {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o Custo de Fábrica?");
        int custoFabrica = scan.nextInt();

        System.out.println("Informe a porcentagem do distribuidor?");
        int porcentagemDistribuidor = scan.nextInt();

        System.out.println("Informe a pecentual de impostos?");
        int percentualImpostos = scan.nextInt();

        int distribuidor = (custoFabrica * porcentagemDistribuidor) / 100;
        int valorImpostos = (custoFabrica * percentualImpostos) / 100;
        int custoConsumidor = custoFabrica + distribuidor + valorImpostos;

        System.out.println("O valor do carro é: R$ " + custoConsumidor + "O percentual do distribuidor é: R$ " + distribuidor +
                " e o valor do imposto é de R$ " + valorImpostos);
    }
}
