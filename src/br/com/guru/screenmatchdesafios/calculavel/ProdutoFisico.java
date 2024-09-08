package br.com.guru.screenmatchdesafios.calculavel;

public class ProdutoFisico implements Calculavel {

    double taxaServico = 0.9;
    double precoProduto;

    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }

    @Override
    public double calcularPrecoFinal() {
        return  precoProduto * taxaServico;
    }
}