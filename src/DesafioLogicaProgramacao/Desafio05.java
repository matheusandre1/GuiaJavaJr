package DesafioLogicaProgramacao;

import java.util.Scanner;

//Faça um algoritmo que leia o valor do salário mínimo e
// o valor do salário de um usuário, calcule quantos salários mínimos esse
//
//usuário ganha e imprima na tela o resultado. (Base para o Salário mínimo R$ 1.293,20).
public class Desafio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Valor do Salario Minimo Atual: ");
        double salarioMinimo = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Valor Do Salário Do Usuário: ");
        double salarioUsuario = scanner.nextDouble();

        double quantidadeSalario = salarioUsuario / salarioMinimo;
        System.out.println("Quantidade de Salários minimos: " + quantidadeSalario);
    }
}
