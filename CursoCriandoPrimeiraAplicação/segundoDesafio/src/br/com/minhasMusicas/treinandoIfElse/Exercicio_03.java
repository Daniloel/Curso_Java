package br.com.minhasMusicas.treinandoIfElse;

import java.util.Scanner;

public class Exercicio_03 {
//    Jéssica trabalha no setor de TI de uma empresa e precisa garantir a segurança dos acessos ao sistema interno.
//    Os funcionários utilizam uma senha fixa para acessar suas contas, e o sistema deve verificar se a senha inserida
//    está correta.
//
//    Ajude Jéssica a criar um programa que, com base em uma senha pré-definida, por exemplo: 123456,
//    verifique se o que o usuário digitou está correto ou não. O programa deve comparar a tentativa com
//    a senha correta e exibir se o acesso foi permitido ou negado.

    public static void main(String[] args) {

        int senhaDefinida = 123456;
        Scanner senhaInserida = new Scanner(System.in);

        System.out.println("Digite a senha !");

        int senhaDigitada = senhaInserida.nextInt();

        if (senhaDigitada == senhaDefinida) {
            System.out.println("Acesso concedido");
        } else {
            System.out.println("Acesso Negado");
        }


    }


}
