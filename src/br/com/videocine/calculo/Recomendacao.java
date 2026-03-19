package br.com.videocine.calculo;

public class Recomendacao {
    private String recomendacao;

    public void filtra(Classificacao c) {
        if (c.getClassificacao() >= 4) {
            System.out.println("Ele está nos preferidos do momento!!");
        } else if (c.getClassificacao() >= 2) {
            System.out.println("Ele é uma recomendação inovadora!");
        } else {
            System.out.println("Coloque na lista de 'ver depois'");
        }

    }
}
