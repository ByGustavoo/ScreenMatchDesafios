package br.com.guru.screenmatchdesafios.musica;

public class Musica {

    private String titulo;
    private String artista;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int anoDeLancamento;

    public void exibirFichaTecnica() {
        System.out.println("Nome da Música: " + titulo);
        System.out.println("Nome do Artista: " + artista);
        System.out.println("Avaliação da Música: " + mediaDasAvaliacoes());
        System.out.println("Ano de Lançamento: " +  anoDeLancamento);
    }

    public void avaliarMusica(double notaDaMusica) {
        somaDasAvaliacoes += notaDaMusica;
        totalDeAvaliacoes++;
    }

    public double mediaDasAvaliacoes() {
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }
}