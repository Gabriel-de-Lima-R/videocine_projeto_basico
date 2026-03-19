import br.com.videocine.calculo.CalculadoraDeTempo;
import br.com.videocine.models.Filme;
import br.com.videocine.models.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("Mama Mia");
        meuFilme.setAnoDeLancamento(1988);
        meuFilme.setDuracaoEmMinutos(119);

        meuFilme.avalia(8.5);
        meuFilme.avalia(7.5);
        meuFilme.avalia(6.6);
        meuFilme.avalia(4);
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



    }
}