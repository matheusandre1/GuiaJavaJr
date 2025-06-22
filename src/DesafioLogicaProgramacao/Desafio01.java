package DesafioLogicaProgramacao;

import java.util.Scanner;

//1 - Faça um algoritmo que leia os valores de A, B, C e
// em seguida imprima na tela a soma entre A e B é
// mostre se a soma é menor que C.
public class Desafio01 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Valor A: ");
        int valorA = scanner.nextInt();
        System.out.print("Valor B: ");
        int valorB = scanner.nextInt();
        System.out.print("Valor C: ");
        int valorC= scanner.nextInt();

        int sum = valorA + valorB;

        var verification = sum > valorC ? "A Soma é maior que Valor C" : "A soma é menor que o valor C";

        System.out.println("Soma: " + sum);
        System.out.println(verification);

    }
}
