package br.com.minhasMusicas.treinandoIfElse;

import java.util.Scanner;

public class Exercicio_06 {

//    Carlos trabalha em uma empresa de logística que opera apenas de segunda a sexta, sem atividades nos finais de semana.
//    Para evitar confusões, ele precisa de um programa que, ao receber um dia da semana, informe se é um dia útil ou não.
//    Crie um programa que receba um dia da semana (em letras minúsculas) e exiba uma mensagem indicando se é um dia
//    útil ou não.
//

    public static void main(String[] args) {

        Scanner diaDaSemana = new Scanner(System.in);

        System.out.println("Digite um dia da Semana");

        String dia = diaDaSemana.nextLine();

        dia = dia.toLowerCase();

        if (dia.equals("segunda") || dia.equals("terca")||
            dia.equals("quarta")  || dia.equals("quinta") || dia.equals("sexta")){
            System.out.println(dia + " é dia util");
        }else {
            System.out.println("não é dia util");
        }
    }
}
