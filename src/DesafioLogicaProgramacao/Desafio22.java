package DesafioLogicaProgramacao;

import java.util.Scanner;

//
 //22 - Faça um algoritmo que leia dois valores inteiros A e B,
// imprima na tela o quociente e o resto da divisão inteira entre eles.
public class Desafio22 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Valor A: ");
        int a = scanner.nextInt();
        System.out.println("Valor B: ");
        int b = scanner.nextInt();

        if(b == 0){
            System.out.println("Não existe divisão por Zero");
        }
        else
        {
            int quociente = a / b;
            int restoDaDivisao = a % b;


            System.out.println("Quociente: " + quociente);
            System.out.println("Restrotoot: " + restoDaDivisao);
        }
    }
}
