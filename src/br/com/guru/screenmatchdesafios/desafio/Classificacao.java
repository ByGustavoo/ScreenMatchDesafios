package br.com.guru.screenmatchdesafios.desafio;

public class Classificacao {

    public void getAvaliacao(Audio audio) {
        if (audio.getClassificacao() >= 9 ) {
            System.out.println(audio.getTitulo() + " está entre os melhores do momento!");
        }
        else {
            System.out.println(audio.getTitulo() + " é uma ótima opção para aproveitar!");
        }
    }
}