package br.com.videocine.models;

public class Filme {
    private String nome;
    private int anoDeLancamento;
    boolean incluidoNoPlano;
    private double somaAvaliacao;
    private int totalDeAvaliacao;
    private int duracaoEmMinutos;
    private double media;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public double getSomaAvaliacao() {
        return this.somaAvaliacao;
    }

    public void exibeFichaTecnica() {
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
    }

    public void avalia(double nota) {
        somaAvaliacao += nota;
        totalDeAvaliacao++;
        media = calculaMedia(somaAvaliacao, totalDeAvaliacao);
    }

    double calculaMedia(double soma, double total) {
        return soma / total;
    }

    void mostraMedia() {
        System.out.println("Média: " + this.media + " (" + this.totalDeAvaliacao + " Pessoas avaliaram)" );
    }

    // caso chame a varivel, a String deve ser:
    @Override
    public String toString() {
        return "Nome do br.com.java1.videotube.models.br.com.videocine.models.Filme: " + this.nome + " (" + this.anoDeLancamento + ")";
    }
}
