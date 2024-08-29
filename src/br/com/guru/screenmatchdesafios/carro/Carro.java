package br.com.guru.screenmatchdesafios.carro;

import java.time.LocalDate;
import java.util.Date;

public class Carro {

    private String modelo;
    private String cor;
    private int ano;
    private int anoAtual;

    public Carro() {
        anoAtual = LocalDate.now().getYear();
    }

    public void exibirFichaTecnica() {
        System.out.println("Modelo do Carro: " + modelo);
        System.out.println("Cor do Carro: " + cor);
        System.out.println("Ano do Carro: " + ano);
    }

    public void calcularIdadeCarro() {
        System.out.println("Idade do Carro: " + (anoAtual - ano) + " anos");
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}