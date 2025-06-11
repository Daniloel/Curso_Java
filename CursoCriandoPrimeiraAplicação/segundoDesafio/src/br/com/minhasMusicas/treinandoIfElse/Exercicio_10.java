package br.com.minhasMusicas.treinandoIfElse;

import java.util.Scanner;

public class Exercicio_10 {

    //    João está desenvolvendo um sistema de segurança para uma empresa. Para acessar o sistema,
//    o usuário precisa fornecer:
//
//    Um código de acesso numérico (o código correto é 2023).
//
//    Um nível de permissão numérico (os níveis válidos são 1, 2 ou 3).
//
//    O sistema só permitirá o acesso se:
//
//    O código de acesso estiver correto.
//
//    O nível de permissão for válido (1, 2 ou 3).
//
//    Caso contrário, o acesso será negado, e o programa deve informar o motivo (código incorreto,
//    nível de permissão inválido ou ambos).
//
//    Crie um programa que receba o código de acesso e o nível de permissão e exiba uma mensagem indicando se
//    o acesso foi permitido ou negado, além do motivo, se for o caso.
//
    public static void main(String[] args) {

        Scanner senha = new Scanner(System.in);

        System.out.println("Insira a senha !");

        int codigo = senha.nextInt();

        System.out.println("Digite o nivel ");

        int nivel = senha.nextInt();


        if ((codigo == 2023) && (nivel == 1 || nivel == 2 || nivel == 3)) {
            System.out.println("Acesso permitido");
        } else {
            if (codigo != 2023) {
                System.out.println("Código incorreto");
            } else if (nivel != 1 || nivel != 2 || nivel != 3) {
                System.out.println("Erro no nivel de Acesso");
            }
        }

    }
}
