package DesafioLogicaProgramacao;

import java.util.Scanner;

//15 - Faça um algoritmo que leia o ano em que uma pessoa nasceu,
// imprima na tela quantos anos, meses e dias essa pessoa ja viveu.
// Leve em
//
//consideração o ano com 365 dias e o mês com 30 dias.
//
//(Ex: 5 anos, 2 meses e 15 dias de vida)
public class Desafio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = scanner.nextInt();


        System.out.print("Digite o mês de nascimento (1 a 12): ");
        int mesNascimento = scanner.nextInt();


        System.out.print("Digite o dia de nascimento (1 a 30): ");
        int diaNascimento = scanner.nextInt();


        System.out.print("Digite o ano atual: ");
        int anoAtual = scanner.nextInt();


        System.out.print("Digite o mês atual (1 a 12): ");
        int mesAtual = scanner.nextInt();


        System.out.print("Digite o dia atual (1 a 30): ");
        int diaAtual = scanner.nextInt();


        int diasVividos = (anoAtual - anoNascimento) * 365;
        diasVividos += (mesAtual - mesNascimento) * 30;
        diasVividos += (diaAtual - diaNascimento);


        int anos = diasVividos / 365;
        int meses = (diasVividos % 365) / 30;
        int dias = (diasVividos % 365) % 30;

        System.out.println("Você viveu: " + anos + " anos, " + meses + " meses e " + dias + " dias.");

        scanner.close();    }
}
