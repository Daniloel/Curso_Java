package br.com.minhasMusicas.treinandoIfElse;

public class Exercicio_02 {
//    Julia é professora e precisa de um programa que ajude a determinar se um aluno foi aprovado na disciplina.
//    A regra da escola é:
//    O estudante é aprovado se média final é maior ou igual a 7.0.
//    Se a média for entre 5.0 e 6.9, está de recuperação.
//            Se for abaixo de 5.0, está reprovado.
//    Crie um programa que, a partir de uma variável media, exiba a situação do estudante conforme as
//    regras da escola.

    public static void main(String[] args) {
        double nota_01 = 7;
        double nota_02 = 3;
        double media = (nota_02 + nota_01) /2;

        if (media >= 7 && media <= 10) {
            System.out.println("ALuno Aprovado");
        } else if (media >= 5 && media <= 6.9) {
            System.out.println("está de recuperação");
        } else if (media < 5 && media > 0) {
            System.out.println("Reprovado");
        } else {
            System.out.println("Numero não existe");
        }
    }
}
