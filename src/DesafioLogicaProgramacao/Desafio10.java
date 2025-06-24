package DesafioLogicaProgramacao;

import java.util.Scanner;
// 10 - Faça um algoritmo que leia três notas obtidas por um aluno, e imprima na tela a média das notas.
public class Desafio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double soma = 0;
        double nota = 0;
        double media = 0;
        for (int i = 1; i <= 3; i++) {

            System.out.print("Nota " + i + ": ");
            nota = scanner.nextDouble();
            soma += nota;
        }

        media = soma / 3;



        System.out.println("Média: " + media);
    }
}
