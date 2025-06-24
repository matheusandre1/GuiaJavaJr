package DesafioLogicaProgramacao;

import java.util.Scanner;

//21 - Faça um algoritmo que efetue o cálculo do salário líquido de um professor.
// As informações fornecidas serão: valor da hora aula, número de aulas lecionadas no mês e
// percentual de desconto do INSS. Imprima na tela o salário líquido final.
public class Desafio23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Valor da hora: ");
        double valorHora = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Números de aulas lecionadas: ");
        double horaslecionadas = scanner.nextDouble();
        System.out.print("Percentual de Desconto: ");
        double percentual = scanner.nextDouble();

        double valorbruto = valorHora * horaslecionadas;

        double descontoInss = valorbruto * (percentual / 100.0);

        double salarioLiquido = valorbruto - descontoInss;

        System.out.println("Salário Liquido: " + salarioLiquido);




    }
}
