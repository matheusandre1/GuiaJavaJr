package DesafioLogicaProgramacao;

import java.util.Scanner;

//17 - Faça um algoritmo que leia uma temperatura em Fahrenheit e
// calcule a temperatura correspondente em grau Celsius.
// Imprima na tela as duas temperaturas.
//
//Fórmula: C = (5 * ( F-32) / 9)
public class Desafio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Temperatura em Fahrentheit: ");
        double f = scanner.nextDouble();

        double formula = (5 * ( f -32) / 9);


        System.out.println("Celsius: " + formula);


    }
}
