package br.com.Curso.primeiroprojeto;

import br.com.Curso.primeiroprojeto.model.Funcionario;

import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) {


        Funcionario MCT = new Funcionario("José", 1, LocalDate.of(1990, 2, 12));

        System.out.println(MCT.getNome() +" matricula " + MCT.getMatricula()+" data de Nacimento "+ MCT.getDataDeNascimento());
    }
}
