package br.com.videocine.principal;

import br.com.videocine.models.Filme;
import br.com.videocine.models.Serie;
import br.com.videocine.models.Titulo;

import java.util.ArrayList;

public class PrincipalListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Mama Mia", 1988);
        meuFilme.setDuracaoEmMinutos(119);

        meuFilme.avalia(10);
        meuFilme.avalia(9.5);
        meuFilme.avalia(9);
        meuFilme.avalia(9);

        Serie minhaSerie = new Serie("Ilhado com a sogra", 2022);
        minhaSerie.setTemporadas(4);
        minhaSerie.setEpisodiosPorTemporada(16);
        minhaSerie.setMinutosPorEpisodio(25);

        Filme seuFilme = new Filme("007: os espiões", 2001);
        seuFilme.setDuracaoEmMinutos(136);
        seuFilme.avalia(4);
        seuFilme.avalia(6);

        Filme nossoFilme = new Filme("Minios", 2018);
        nossoFilme.setDuracaoEmMinutos(109);
        nossoFilme.avalia(9);

        Filme filmeNinguem = nossoFilme;

        filmeNinguem.setAnoDeLancamento(2013);

        ArrayList<Titulo> listaTitulos = new ArrayList<>();
        listaTitulos.add(nossoFilme);
        listaTitulos.add(filmeNinguem);
        listaTitulos.add(meuFilme);
        listaTitulos.add(seuFilme);
        listaTitulos.add(minhaSerie);

        System.out.println(listaTitulos.size() + " Títulos na Coleção");
        for (Titulo t : listaTitulos) {
            String nome = t.getNome();
            String ano = " (" + t.getAnoDeLancamento() + ")";
            int i = listaTitulos.indexOf(t);

            System.out.println((i + 1) + "- " + nome + ano);

            if (t instanceof Filme filme) {
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }
    }

}
