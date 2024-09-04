package br.com.guru.screenmatchdesafios.produto;

public class Produto {

    private String nome;
    private Double preco;

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
}