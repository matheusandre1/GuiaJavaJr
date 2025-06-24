package DesafioLogicaProgramacao;
//18 - Francisco tem 1,50m e cresce 2 centímetros por ano,
// enquanto Sara tem 1,10m e cresce 3 centímetros por ano.
// Faça um algoritmo que calcule e imprima na tela em quantos anos serão
// necessários para que Francisco seja maior que Sara.
public class Desafio18 {
    public static void main(String[] args) {

        int anos = 0;
        double francisco = 1.50;
        double centimetrosFrancisco = 0.02;
        double sara = 1.10;
        double centimetrosSara = 0.03;

        while (sara < francisco)
        {
            francisco += centimetrosFrancisco;
            sara += centimetrosSara;
            anos++;
        }


        System.out.println("Vai demorar: " + anos + " anos");


    }
}
