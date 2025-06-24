package DesafioLogicaProgramacao;

import java.util.Scanner;

//20 - Faça um algoritmo que receba um valor inteiro e
// imprima na tela a sua tabuada.
public class Desafio20 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero = scanner.nextInt();

        System.out.println("Tabuada de " + numero);
        for (int i = 1; i <= 10 ; i++)
        {
            System.out.println(numero + " * " + i + " = " + (numero * i));
        }
    }
}
