package br.com.Curso.primeiroprojeto.model;

import java.time.LocalDate;

public class Funcionario {

    private String nome;
    private int matricula;
    private LocalDate dataDeNascimento;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public Funcionario(String nome, int matricula, LocalDate dataDeNascimento) {
        this.nome = nome;
        this.matricula = matricula;
        this.dataDeNascimento = dataDeNascimento;
    }

    @Override
    public String toString() {

        return "Funcionario{" +
                "nome='" + getNome() + '\'' +
                ", matricula=" + getMatricula() +
                ", dataNascimento=" + getDataDeNascimento() +
                '}';
    }


}
