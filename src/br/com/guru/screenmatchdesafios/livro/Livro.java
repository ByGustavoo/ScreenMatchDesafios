package br.com.guru.screenmatchdesafios.livro;

public class Livro {

    private String titulo;
    private String autor;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void exibirDetalhes() {
        System.out.println("Autor do Livro: " + autor);
        System.out.println("Título do Livro: " + titulo);
    }
}