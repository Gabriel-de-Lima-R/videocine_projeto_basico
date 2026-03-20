package br.com.videocine.models;

import br.com.videocine.calculo.Classificacao;

public class Filme extends Titulo implements Classificacao {
    private String diretor;

    public Filme(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) getMedia() / 2;
    }
}
