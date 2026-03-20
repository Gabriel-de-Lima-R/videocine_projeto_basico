package br.com.videocine.calculo;

import br.com.videocine.models.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal = 0;

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void setTempoTotal(int tempoTotal) {
        this.tempoTotal = tempoTotal;
    }


    public void inclui(Titulo t) {
        if (t.getDuracaoEmMinutos() > 0) {
            System.out.println("Adicionando duração em minutos de " + t);
            tempoTotal += t.getDuracaoEmMinutos();
        }
    }
}
