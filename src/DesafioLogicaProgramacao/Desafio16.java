package DesafioLogicaProgramacao;

import java.util.Scanner;

//16 - Faça um algoritmo que leia três valores que representam os
// três lados de um triângulo e verifique se são válidos,
// determine se o triângulo é
//
//equilátero, isósceles ou escaleno.
public class Desafio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Valor 1: ");
        int valor1 = scanner.nextInt();
        System.out.println("Valor 2: ");
        int valor2 = scanner.nextInt();
        System.out.println("Valor 3: ");
        int valor3 = scanner.nextInt();


        if(valor1 == valor2 && valor1 == valor3 && valor2 == valor3)
        {
            System.out.println("Equilatero");
        }
        else if (valor1 == valor2 || valor2 == valor3 || valor1 == valor3)
        {
            System.out.println("Isosceles");
        }
        else
        {
            System.out.println("Escaleno");
        }

    }
}
