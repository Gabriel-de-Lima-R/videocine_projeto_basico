import br.com.videocine.models.Filme;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Mama Mia");
        meuFilme.setAnoDeLancamento(1988);
        meuFilme.setDuracaoEmMinutos(119);

        meuFilme.avalia(10);
        meuFilme.avalia(9.5);
        meuFilme.avalia(9);
        meuFilme.avalia(9);
        //meuFilme.exibeFichaTecnica();
        //meuFilme.mostraMedia();
        //System.out.println(meuFilme.getSomaAvaliacao());


        /*Serie minhaSerie = new Serie();
        minhaSerie.setNome("Ilhado com a sogra");
        minhaSerie.setAnoDeLancamento(2022);
        //minhaSerie.exibeFichaTecnica();
        minhaSerie.setTemporadas(4);
        minhaSerie.setEpisodiosPorTemporada(16);
        minhaSerie.setMinutosPorEpisodio(25);

        System.out.println("Duração da série: " + minhaSerie.getDuracaoEmMinutos());*/

        Filme seuFilme = new Filme("007: os espiões");
        seuFilme.setAnoDeLancamento(2001);
        seuFilme.setDuracaoEmMinutos(136);

        /*CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(seuFilme);
        calculadora.inclui(minhaSerie);
        System.out.println(calculadora.getTempoTotal());

        Recomendacao filtro = new Recomendacao();
        filtro.filtra(meuFilme);

        Episodio epi1 = new Episodio();
        epi1.setNumero(1);
        epi1.setSerie(minhaSerie);
        epi1.setTotalVisualizacoes(300);

        filtro.filtra(epi1);*/

        Filme nossoFilme = new Filme("Minios");
        nossoFilme.setAnoDeLancamento(2018);
        nossoFilme.setDuracaoEmMinutos(109);
        nossoFilme.avalia(9);

        ArrayList<Filme> listaFilme = new ArrayList<>();
        listaFilme.add(nossoFilme);
        listaFilme.add(meuFilme);
        listaFilme.add(seuFilme);

        System.out.println(listaFilme.size() + " Filmes na Coleção");

        for (Filme f : listaFilme) {
            String nome = f.getNome();
            int i = listaFilme.indexOf(f);
            System.out.println((i + 1) + "- " + nome);
        }




    }
}