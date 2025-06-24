package DesafioLogicaProgramacao;

import java.util.Scanner;

//14 - Faça um algoritmo que receba um valor A e B,
// e troque o valor de A por B e o valor de B por A e
// imprima na tela os valores.
public class Desafio14 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Valor A: ");
        int a = scanner.nextInt();
        System.out.println("Valor B: ");
        int b = scanner.nextInt();

        var aux = a;

         a = b;
         b = aux;

        System.out.println(a);
        System.out.println(b);

    }
}
