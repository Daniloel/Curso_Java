package br.com.minhasMusicas.treinandoIfElse;

import java.util.Scanner;

public class Exercicio_04 {

//    Pedro está aprendendo Java e se deparou com um problema: ele precisa criar um programa que compare
//    dois números inteiros fornecidos pelo usuário e informe qual é o maior ou se são iguais.
//    Mas, ele está com dificuldades para implementar a lógica de comparação e exibir o resultado corretamente.
//
//    Ajude Pedro a resolver esse problema! Crie um programa que solicite ao usuário dois números inteiros,
//    compare-os e exiba uma mensagem indicando qual é o maior ou se ambos são iguais

    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);

        System.out.println("Digite o numero 01");
        int num_01 = numero.nextInt();

        System.out.println("Digite o numero 02");
        int num_02 = numero.nextInt();


        if (num_01 > num_02) {
            System.out.println("Numero 01 é maior");
        } else if (num_01 < num_02) {
            System.out.println("Numero 02 maior ");

        } else {
            System.out.println("Os numeros são iguais");
        }
    }
}
