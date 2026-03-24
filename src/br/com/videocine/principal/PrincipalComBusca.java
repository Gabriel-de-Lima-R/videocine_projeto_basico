package br.com.videocine.principal;

import br.com.videocine.models.Titulo;
import br.com.videocine.models.TituloOMDB;
import com.google.gson.Gson;
import java.util.Map;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Qual filme você quer pesquisar?");
        String filme = leitor.nextLine();
        String url = String.format("http://www.omdbapi.com/?t=%s&apikey=7f608db7", filme);

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();


        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();
        System.out.println(json);

        Gson gson = new Gson();

        TituloOMDB meuTitulo = gson.fromJson(json, TituloOMDB.class);
        System.out.println(meuTitulo);

        Titulo titulinho = new Titulo(meuTitulo.Title(), meuTitulo.Year(), meuTitulo.Runtime());
        System.out.println(titulinho);

    }
}
