package br.com.minhasMusicas.modelo;

public class Audio {

    private String titulo;
    private int toltalReproducao;
    private int totalCurtidas;
    private int classificacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getToltalReproducao() {
        return toltalReproducao;
    }

    public void setToltalReproducao(int toltalReproducao) {
        this.toltalReproducao = toltalReproducao;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public void setTotalCurtidas(int totalCurtidas) {
        this.totalCurtidas = totalCurtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }

    public void curte (){
        this.totalCurtidas++;
    }

    public void reproduz (){
        this.toltalReproducao++;
    }



}
