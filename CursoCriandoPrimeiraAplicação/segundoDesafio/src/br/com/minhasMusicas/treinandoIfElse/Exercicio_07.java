package br.com.minhasMusicas.treinandoIfElse;

import java.util.Scanner;

public class Exercicio_07 {

//    Emerson trabalha em um banco e precisa verificar se um número digitado pelo cliente está dentro da faixa permitida
//    de valores para um empréstimo, que vai de 1000 a 5000 reais.
//    Crie um programa que receba um valor e exiba se ele está dentro do intervalo permitido ou não.
//


    public static void main(String[] args) {
        Scanner valorRecebido = new Scanner(System.in);

        System.out.println("Digite o valor Recebido");

        double valor = valorRecebido.nextDouble();

        if (valor >= 1000 && valor <= 5000) {
            System.out.println("O" + valor + " não está dentro do intervalo permitido para empréstimo.");
        } else {
            System.out.println("O valor " + valor + "não esta dentro dos valores");
        }

    }
}
