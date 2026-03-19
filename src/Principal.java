import br.com.videocine.calculo.CalculadoraDeTempo;
import br.com.videocine.calculo.Recomendacao;
import br.com.videocine.models.Episodio;
import br.com.videocine.models.Filme;
import br.com.videocine.models.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("Mama Mia");
        meuFilme.setAnoDeLancamento(1988);
        meuFilme.setDuracaoEmMinutos(119);

        meuFilme.avalia(10);
        meuFilme.avalia(9.5);
        meuFilme.avalia(9);
        meuFilme.avalia(9);
        //meuFilme.exibeFichaTecnica();
        //meuFilme.mostraMedia();
        //System.out.println(meuFilme.getSomaAvaliacao());


        Serie minhaSerie = new Serie();
        minhaSerie.setNome("Ilhado com a sogra");
        minhaSerie.setAnoDeLancamento(2022);
        //minhaSerie.exibeFichaTecnica();
        minhaSerie.setTemporadas(4);
        minhaSerie.setEpisodiosPorTemporada(16);
        minhaSerie.setMinutosPorEpisodio(25);

        //System.out.println("Duração da série: " + minhaSerie.getDuracaoEmMinutos());

        Filme seuFilme = new Filme();
        seuFilme.setNome("007: os espiões");
        seuFilme.setAnoDeLancamento(2001);
        seuFilme.setDuracaoEmMinutos(136);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
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

        filtro.filtra(epi1);
    }
}