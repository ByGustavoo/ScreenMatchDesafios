package br.com.guru.screenmatchdesafios.calcular;

public class CalculadoraSalaRetangular implements CalculoGeometrico {

    @Override
    public void calcularArea(double altura, double largura) {
        double valorAreaRetangulo;

        valorAreaRetangulo = altura * largura;

        System.out.println("Área do Retângulo: " + valorAreaRetangulo);
    }

    @Override
    public void calcularPerimetro(double altura, double largura) {
        double valorPerimetroRetangulo;

        valorPerimetroRetangulo = 2 * (altura + largura);

        System.out.println("Perímetro do Retângulo: " + valorPerimetroRetangulo);
    }
}