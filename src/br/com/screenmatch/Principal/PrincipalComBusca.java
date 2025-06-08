package br.com.screenmatch.Principal;

import br.com.screenmatch.excecao.ErroDeConversaoDeAnoException;
import br.com.screenmatch.modelo.Filme;
import br.com.screenmatch.modelo.Titulo;
import br.com.screenmatch.modelo.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        String busca = "";
        List<Titulo> titulos = new ArrayList<>();

        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();


        while (!busca.equalsIgnoreCase("sair")) {

            System.out.println("Digite o seu filme");

            busca = leitura.nextLine();

            String endereco = "https://www.omdbapi.com/?t=" + busca.replace(" ", "+") + "&apikey=6585022c";

            if (busca.equalsIgnoreCase("sair")) {
                break;
            }

            try {
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(endereco))
                        .build();
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                //System.out.println(response.body());
                String json = response.body();
                System.out.println(json);


                TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);
                System.out.println(meuTituloOmdb);
                Titulo meuTitulo = new Titulo(meuTituloOmdb);
                System.out.println("Titulo já  convertido");

                titulos.add(meuTitulo);

                //System.out.println(meuTitulo);
            } catch (NumberFormatException e) {
                System.out.println("Esse erro ocorre com o Divertidamente" + e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            } catch (ErroDeConversaoDeAnoException e) {
                System.out.println(e.getMessage());
            }


        }

        System.out.println("Esse sao os tilulos" + titulos);

        FileWriter escrita = new FileWriter("filmes.json");
        escrita.write(gson.toJson(titulos));
        escrita.close();

        System.out.println("Programa finalizado");
    }


}

