package br.com.guru.screenmatchdesafios.carro;

import java.time.LocalDate;

public class Carro {

    private String modelo;
    private String cor;
    private int ano;
    private final int anoAtual;
    private double precoAno1;
    private double precoAno2;
    private double precoAno3;

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

    public void setValoresPorAno(double valor1, double valor2, double valor3) {
        this.precoAno1 = valor1;
        this.precoAno2 = valor2;
        this.precoAno3 = valor3;
    }

    public double calcularMenorValor() {
        double menorNumero = precoAno1;

        if (precoAno2 < menorNumero) {
            menorNumero = precoAno2;
        }
        if (precoAno3 < menorNumero) {
            menorNumero = precoAno3;
        }
        return menorNumero;
    }

    public double calcularMaiorValor() {
        double maiorNumero = precoAno1;

        if (precoAno2 > maiorNumero) {
            maiorNumero = precoAno2;
        }
        if (precoAno3 > maiorNumero) {
            maiorNumero = precoAno3;
        }
        return maiorNumero;
    }

    public void exibirInformacoes() {
        System.out.println("Modelo do Carro: " + modelo);
        System.out.println("Custo do Primeiro Ano: R$ " + precoAno1 + " Reais");
        System.out.println("Custo do Segundo Ano: R$ " + precoAno2 + " Reais");
        System.out.println("Custo do Terceiro Ano: R$ " + precoAno3 + " Reais");
        System.out.println("Menor Consumo: R$ " + calcularMenorValor() + " Reais");
        System.out.println("Maior Consumo: " + calcularMaiorValor() + " Reais");
    }
}