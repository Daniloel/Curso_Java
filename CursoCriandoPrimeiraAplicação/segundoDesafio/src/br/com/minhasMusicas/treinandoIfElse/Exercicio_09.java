package br.com.minhasMusicas.treinandoIfElse;

import java.util.Scanner;

public class Exercicio_09 {

//    Maria trabalha em um banco de sangue e precisa verificar se um doador é compatível para doar sangue.
//    Para ser compatível, o doador deve atender aos seguintes critérios:
//    Ter entre 18 e 65 anos.
//    Pesar mais de 50 kg.
//    Ela deseja um programa que receba a idade e o peso do doador e informe se ele é compatível para doar sangue.
//    Se não for, o programa deve indicar qual critério não foi atendido.
//    Como você criaria um programa que receba a idade e o peso do doador e exiba uma mensagem indicando
//    se ele é compatível ou não, além de informar o critério não atendido, se for o caso?

    public static void main(String[] args) {

        Scanner informacao = new Scanner(System.in);

        System.out.println("Insira sua idade !");

        int idade = informacao.nextInt();

        System.out.println("Digite seu peso ");

        double peso = informacao.nextByte();


        if ((idade >= 18 && idade <= 65) && peso >= 50) {
            System.out.println("Habilitado para doar Sangue");
        } else {
            System.out.println("Não pode doar sangue");
        }

    }
}
