package br.com.minhasMusicas.treinandoIfElse;

import java.util.Scanner;

public class Exercicio_08 {

//    Marcos está estudando geometria e precisa verificar se três lados podem formar um triângulo.
//    Para que três lados formem um triângulo, a soma de dois lados deve ser maior que o terceiro lado.
//    Ele quer um programa que receba três lados e exiba uma mensagem informando se os lados podem formar
//    um triângulo ou não.
//
//    Com base nesse cenário, crie um programa que receba três lados e exiba uma mensagem informando
//    se os lados podem formar um triângulo ou não.

    public static void main(String[] args) {


        Scanner lados = new Scanner(System.in);

        int lado_01 = lados.nextInt();

        int lado_02 = lados.nextInt();

        int lado_03 = lados.nextInt();

        int somaTotal_01 = (lado_01 + lado_02);
        int somaTotal_02 = (lado_01 + lado_03);
        int somaTotal_03 = (lado_03 + lado_02);

        if ((somaTotal_01 > lado_03) && (somaTotal_02 > lado_02) && (somaTotal_03 > lado_01)) {
            System.out.println("É um triangulo");
        } else {
            System.out.println("Não é um trangulo");
        }
    }
}
