package br.com.guru.screenmatchdesafios.produto;

import br.com.guru.screenmatchdesafios.vendavel.Vendavel;

public class Produto implements Vendavel {

    private String nome;
    private Double preco;
    private Double precoTotal;

    public Double getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(Double precoTotal) {
        this.precoTotal = precoTotal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public void aplicarDesconto(int valorDescontoPercentual) {
        double valorDesconto;

         valorDesconto = (valorDescontoPercentual * preco) / 100;

         preco -= valorDesconto;

        System.out.println("Custo do Produto com Desconto: R$ " + preco + " Reais");
    }

    @Override
    public void calcularPrecoFinal(int qtdProduto) {
        precoTotal = preco * qtdProduto;
        System.out.println("Preço do Produto sem Desconto: R$ " + precoTotal);
    }

    @Override
    public void aplicarDesconto(double valorDesconto) {
        double calcularDesconto = precoTotal * valorDesconto;

        double precoFinal = precoTotal - calcularDesconto;

        System.out.println("Valor do Produto com Desconto aplicado: R$ " + precoFinal);


    }
}