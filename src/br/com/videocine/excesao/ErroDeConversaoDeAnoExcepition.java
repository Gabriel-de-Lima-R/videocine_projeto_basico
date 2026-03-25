package br.com.videocine.excesao;

public class ErroDeConversaoDeAnoExcepition extends RuntimeException {
    private String mensagem;

    public ErroDeConversaoDeAnoExcepition(String msg) {
        this.mensagem = msg;

    }

    @Override
    public String getMessage() {
        return this.mensagem;
    }
}
