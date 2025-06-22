package DesafioLogicaProgramacao;

import java.util.Scanner;

//6 - Faça um algoritmo que leia um valor qualquer e imprima na tela com um reajuste de 5%.
public class Desafio06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valor = scanner.nextDouble();

        double reajuste  = valor * 0.05;


        System.out.println("Valor Reajustaso com 5%: " + (valor + reajuste));
    }
}
