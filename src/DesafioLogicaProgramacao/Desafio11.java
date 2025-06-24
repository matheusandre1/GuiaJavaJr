package DesafioLogicaProgramacao;

import java.util.Scanner;
// 11 - Faça um algoritmo que leia quatro notas obtidas por um aluno,
// calcule a média das nota obtidas, imprima na tela o nome do aluno e
//
// se o aluno foi aprovado ou reprovado. Para o aluno ser considerado aprovado sua
// média final deve ser maior ou igual a 7.
public class Desafio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota = 0;
        double soma = 0;
        double media = 0;

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        for (int i = 1; i <= 4; i++)
        {
            System.out.print("Nota " + i + ":");
            nota = scanner.nextDouble();
            soma += nota;
        }

        media = soma / 4;

        var verificacao = media > 7 ? "Aprovado" : "Reprovado";

        System.out.println(nome);
        System.out.println(verificacao);
    }
}
