package br.com.videocine.models;

import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable<Titulo> {
    @SerializedName("Title")
    private String nome;
    @SerializedName("Year")
    private int anoDeLancamento;
    boolean incluidoNoPlano;
    private double somaAvaliacao;
    private int totalDeAvaliacao;
    private int duracaoEmMinutos;
    private double media;

    public Titulo(String title, String year, String runtime) {
        this.nome = title;
        this.anoDeLancamento = Integer.valueOf(year);
        this.duracaoEmMinutos = Integer.valueOf(runtime.substring(0,2));
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
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

    public int getDuracaoEmMinutos() {
        return this.duracaoEmMinutos;
    }

    public double getMedia() {
        return this.media;
    }

    public String getNome() {
        return this.nome;
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
        return "Nome do Filme / Série: " + this.nome + " (" + this.anoDeLancamento + ")" +
                " | Duração: " + this.duracaoEmMinutos + " minutos";
    }

    // isso faz com que Titulos possa ser ordenado, atraves de Collections.sort();

    @Override
    public int compareTo(Titulo t) {
        return this.getNome().compareTo(t.getNome());
    }


}
