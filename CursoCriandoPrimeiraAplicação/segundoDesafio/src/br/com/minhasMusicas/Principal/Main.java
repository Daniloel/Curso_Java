package br.com.minhasMusicas.Principal;


import br.com.minhasMusicas.modelo.MinhasPreferidas;
import br.com.minhasMusicas.modelo.Musica;
import br.com.minhasMusicas.modelo.PodeCast;

public class Main {
    public static void main(String[] args) {

        Musica minhasMusicas = new Musica();
        minhasMusicas.setTitulo("Forever");
        minhasMusicas.setCantor("Kiss");


        for (int i = 0; i < 100; i++) {
            minhasMusicas.reproduz();

        }

        for (int i = 0; i < 50 ; i++) {
            minhasMusicas.curte();
        }

        PodeCast podeCast = new PodeCast();
        podeCast.setTitulo("BolhaDev");
        podeCast.setApresentador("Nem sei");


        for (int i =0; i < 5000; i++){

            podeCast.reproduz();

        }

        for (int i = 0; i < 1000; i++) {

            podeCast.curte();

        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(podeCast);
        preferidas.inclui(minhasMusicas);


    }
}