package br.com.guru.screenmatchdesafios.animal;

public class Gato extends Animal {

    @Override
    public void emitirSom() {
        System.out.println("Miau! Miau!");
    }

    public void arranharMoveis() {
        System.out.println("Estou arranhando os móveis!");
    }
}