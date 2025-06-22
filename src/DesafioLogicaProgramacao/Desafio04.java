package DesafioLogicaProgramacao;
// 4 - Faça um algoritmo que receba um número inteiro e imprima
// na tela o seu antecessor e o seu sucessor.

import java.util.Scanner;

public class Desafio04 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        System.out.println("Antecessor:" + (number - 1));
        System.out.println("Sucessor:" + (number + 1));
    }
}
