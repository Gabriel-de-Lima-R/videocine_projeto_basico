package br.com.videocine.principal;

import br.com.videocine.excesao.ErroDeConversaoDeAnoExcepition;
import br.com.videocine.models.Titulo;
import br.com.videocine.models.TituloOMDB;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
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
        String filme = "";
        List<Titulo> acervo = new ArrayList<>();

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        while(!filme.equalsIgnoreCase("sair")) {
            System.out.println("Qual filme você quer pesquisar [ou digite sair para sair]?");
            filme = leitor.nextLine();

            if (filme.equalsIgnoreCase("sair")) { break; }

            String filmeSeguro = URLEncoder.encode(filme, StandardCharsets.UTF_8);
            String url = String.format("http://www.omdbapi.com/?t=%s&apikey=7f608db7", filmeSeguro);

            try {
                HttpClient client = HttpClient.newHttpClient();

                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(url))
                        .build();


                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                String json = response.body();
                System.out.println(json);

                TituloOMDB meuTitulo = gson.fromJson(json, TituloOMDB.class);
                System.out.println(meuTitulo);

                Titulo titulinho = new Titulo(meuTitulo.Title(), meuTitulo.Year(), meuTitulo.Runtime());
                System.out.println(titulinho);

                acervo.add(titulinho);

            } catch (NumberFormatException e) {
                System.out.println("Aconteceu um erro: " + e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("Algum erro na criação da URL por causa de espaços");
            } catch (ErroDeConversaoDeAnoExcepition e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println(acervo);

        FileWriter escrita = new FileWriter("filmes.json");
        escrita.write(gson.toJson(acervo));
        escrita.close();

        System.out.println("O programa encerrou corretamente");

    }
}
