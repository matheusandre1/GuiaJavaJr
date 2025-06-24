package DesafioLogicaProgramacao;

import java.util.Random;

//21 - Faça um algoritmo que mostre um valor aleatório entre 0 e 100.
public class Desafio21 {
    public static void main(String[] args) {

        Random random = new Random();

        int numero = random.nextInt(101);
        System.out.println("Número aleatório: " + numero);

    }
}
