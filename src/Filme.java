public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double somaAvaliacao;
    int totalDeAvaliacao;
    int duracaoEmMinutos;
    double media;

    void exibeFichaTecnica() {
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
    }

    void avalia(double nota) {
        somaAvaliacao += nota;
        totalDeAvaliacao++;
        media = calculaMedia(somaAvaliacao, totalDeAvaliacao);
    }

    double calculaMedia(double soma, double total) {
        return soma / total;
    }

    // caso chame a varivel, a String deve ser:
    @Override
    public String toString() {
        return "Nome do Filme: " + this.nome + " (" + this.anoDeLancamento + ")";
    }
}
