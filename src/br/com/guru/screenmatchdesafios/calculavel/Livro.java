package br.com.guru.screenmatchdesafios.calculavel;

public class Livro implements Calculavel {

    double taxaServico = 0.7;
    double precoLivro;

    public void setPrecoLivro(double precoLivro) {
        this.precoLivro = precoLivro;
    }

    @Override
    public double calcularPrecoFinal() {
        return precoLivro * taxaServico;
    }
}