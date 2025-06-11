package br.com.Desafio_Cruso;

import java.util.Scanner;

public class ContaBanco {

    public static void main(String[] args) {
        Scanner recebeDados = new Scanner(System.in);

        double saldoConta = 2000.00;
        String nomeCliente = "Loni";
        String tipoConta = "Conta Corrente";
        System.out.println("*****************************************");
        System.out.println("\nNome: ");
        System.out.println("Tipo Conta: ");
        System.out.println("Saldo Inicial: ");
        System.out.println("\n*****************************************");

        int valorMenu = 0;

        while (valorMenu != 4) {
            System.out.println("""
                    Operações
                          1- Consultar saldos
                          2- Receber valor
                          3- Transferir valor
                          4- Sair
                    Digite a opção desejada: """);
            valorMenu = recebeDados.nextInt();

            if (valorMenu == 1) {

                System.out.println("O saldo da conta : " + saldoConta);
            } else if (valorMenu == 2) {
                System.out.println("Digite o valor a receber ");
                double depositoConta = recebeDados.nextDouble();
                saldoConta += depositoConta;
                System.out.println("Novo saldo da conta " + saldoConta);
            } else if (valorMenu == 3) {
                System.out.println("Digite o valor a ser transferido ");
                double tranferirSaldo = recebeDados.nextDouble();

                if (tranferirSaldo > saldoConta) {
                    System.out.println("Saldo insuficiente !");
                } else {
                    saldoConta = saldoConta - tranferirSaldo;
                    System.out.println("Novo Saldo " + saldoConta);
                }

            } else if (valorMenu != 4) {
                System.out.println("Opção invalida");

            } else if (valorMenu == 4) {
                System.out.println("Finalizada a Consulta");
                break;
            }

        }

    }

}
