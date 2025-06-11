package br.com.screenmatch.Principal;

import br.com.screenmatch.modelo.Filme;
import br.com.screenmatch.modelo.Serie;
import br.com.screenmatch.modelo.Titulo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalComListas {

    public static void main(String[] args) {

        Filme meuFilme = new Filme("Poderoso Chefao", 1970);
        meuFilme.avalia(8);
        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(6);
        Filme filmeDoDanilo = new Filme("DoFilme", 2019);
        filmeDoDanilo.avalia(10);
        Serie lost = new Serie("Lost", 2000);


        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(filmeDoDanilo);
        lista.add(lost);


        for (Titulo item : lista) {

            System.out.println(item.getNome());

            if (item instanceof Filme filme && ((Filme) item).getClassificacao() >2)
                System.out.println("A classicaçao " + ((Filme) item).getClassificacao());

        }


        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add ("Artista_1");
        buscaPorArtista.add ("rtista_2");
        buscaPorArtista.add ("btista_3");

        Collections.sort(buscaPorArtista);
        System.out.println("Lista de artista Ordenada ");
        System.out.println( buscaPorArtista);


        Collections.sort(lista);
        System.out.println("Titulos ordenados por ordem alfabetica" );
        System.out.println(lista);



        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Titulos ordenados por ano " );
        System.out.println(lista);


    }
}
