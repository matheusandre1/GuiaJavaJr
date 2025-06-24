package DesafioLogicaProgramacao;

import java.util.Scanner;

// 13 - Faça algoritmo que leia o nome e a idade de uma peso e
// imprima na tela o nome da pessoa e se ela é maior ou menor de idade.
public class Desafio13 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Idade: ");
        int idade = scanner.nextInt();

        var verificacao = idade >= 18 ? "Maior de Idade" : "Menor de Idade";

        System.out.println(nome);
        System.out.println(verificacao);

    }
}
