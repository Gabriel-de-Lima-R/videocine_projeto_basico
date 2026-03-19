public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome = "Mama Mia";
        meuFilme.anoDeLancamento = 1988;
        meuFilme.duracaoEmMinutos = 119;

        meuFilme.avalia(8.5);
        meuFilme.avalia(7.5);
        meuFilme.avalia(6.6);
        meuFilme.avalia(4);
        meuFilme.exibeFichaTecnica();
        System.out.println("Média: " + meuFilme.media + " (" + meuFilme.totalDeAvaliacao + " Pessoas avaliaram)" );
    }
}