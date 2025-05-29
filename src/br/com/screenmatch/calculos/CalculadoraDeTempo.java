package br.com.screenmatch.calculos;

import br.com.screenmatch.modelo.Titulo;

public class CalculadoraDeTempo {

    private int tempoTotal;

    public void inclui (Titulo titulo){
        tempoTotal+= titulo.getDuracaoEmMinutos();
    }

    public int getTempoTotal() {
        return tempoTotal;
    }
}
