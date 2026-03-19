import br.com.videocine.models.Filme;

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
        meuFilme.exibeFichaTecnica();
        //meuFilme.mostraMedia();
        System.out.println(meuFilme.getSomaAvaliacao());

    }
}