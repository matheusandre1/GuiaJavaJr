package DesafioLogicaProgramacao;
//8 - Faça um algoritmo que leia três valores inteiros
// diferentes e imprima na tela os valores em ordem decrescente.

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

//8 - Faça um algoritmo que leia três valores
// inteiros diferentes e imprima na tela os valores em ordem decrescente.
public class Desafio08 {
    public static void main(String[] args) {
        List<Integer> inteiros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 3 ; i++)
        {
            System.out.println("Valor " + i);
            int number = scanner.nextInt();
            inteiros.add(number);
        }

        inteiros.sort((a, b) -> Integer.compare(b, a));

        inteiros.forEach(System.out::println);

    }
}
