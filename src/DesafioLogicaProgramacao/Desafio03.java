package DesafioLogicaProgramacao;

import java.util.Scanner;

//Faça um algoritmo que leia dois valores inteiros A e B,
// se os valores de A e B forem iguais, deverá somar os dois valores,
//
//caso contrário devera multiplicar A por B. Ao final de qualquer um dos cálculos deve-se
// atribuir o resultado a uma variável C e
//
//imprimir seu valor na tela.
public class Desafio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int a = scanner.nextInt();
        int b = scanner.nextInt();

        var verification = a == b ? a + b  : a * b;

        int c = verification;

        System.out.println(c);

    }
}
