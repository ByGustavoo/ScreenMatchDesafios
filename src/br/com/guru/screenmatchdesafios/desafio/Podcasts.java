package br.com.guru.screenmatchdesafios.desafio;

public class Podcasts extends Audio {

    private String apresentador;
    private String descricao;

    public String getApresentador() {
        return apresentador;
    }

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public void curtir() {
        super.curtir();
    }

    @Override
    public void reproduzir() {
        super.reproduzir();
    }

    @Override
    public int getClassificacao() {
        if (this.getCurtidas() > 200) {
            return 10;
        }
        else {
            return 7;
        }
    }
}

