package DesafioLogicaProgramacao;

import java.util.Scanner;

//2 - Faça um algoritmo para receber um número qualquer e
// imprimir na tela se o número é par ou ímpar, positivo ou negativo.
public class Desafio02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        var verification1 = number % 2 == 0 ? "Par" : "Impar";
        var verification2 = number > 0 ? "Positivo" : "Negativo";

        System.out.println(verification1);
        System.out.println(verification2);
    }
}
