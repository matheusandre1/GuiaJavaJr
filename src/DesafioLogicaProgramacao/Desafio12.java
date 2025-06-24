package DesafioLogicaProgramacao;

import java.util.Scanner;
// 12 - Faça um algoritmo que leia o valor de um produto e determine o valor que deve ser pago, conforme a escolha da forma de pagamento
//
// pelo comprador e imprima na tela o valor final do produto a ser pago. Utilize os códigos da tabela de condições de pagamento para efetuar o cálculo adequado.

// Tabela de Código de Condições de Pagamento
// 1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto
// 2 - À Vista no cartão de crédito, recebe 10% de desconto
// 3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros
// 4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%
public class Desafio12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String menu = """
                1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto
                
                 2 - À Vista no cartão de crédito, recebe 10% de desconto
                
                 3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros
                
                 4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10% casos de testes
                """;

        String parcelas = "";
        double desconto = 0;
        System.out.print("Digite o valor do produto: ");
        double valor = scanner.nextDouble();
        System.out.println(menu);
        System.out.print("Digite sua opção: ");
        int opcao = scanner.nextInt();


        switch (opcao)
        {
            case 1:
                System.out.println("Valor do produto: " + (valor - (valor * 0.15)));
                break;
            case 2:
                System.out.println("Valor do produto: " + (valor - (valor * 0.1)));
                break;
            case 3:
                System.out.println("Valor do produto: " + valor);
                break;
            case 4:
                System.out.println("Valor do produto: " + (valor + (valor * 0.1)));
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }
}
