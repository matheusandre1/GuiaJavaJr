package DesafioLogicaProgramacao;

import java.util.Scanner;

//22 - Faça um algoritmo que calcule a quantidade de litros de combustível gastos em uma viagem,
// sabendo que o carro faz 12km com um litro. Deve-se fornecer ao usuário o tempo que será gasto na viagem a
// sua velocidade média, distância percorrida e a quantidade de litros utilizados para fazer a viagem.
public class Desafio24 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o tempo da Viagem: ");
        double tempo = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Digite a velocida média: ");
        double velocidadeMedia = scanner.nextDouble();

        double distancia = tempo * velocidadeMedia;

        double litrosUtilizados = distancia / 12;

        System.out.println("Litros Utilizados: " + litrosUtilizados);


    }
}
