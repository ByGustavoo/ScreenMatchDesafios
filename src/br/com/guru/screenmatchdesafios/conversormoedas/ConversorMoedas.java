package br.com.guru.screenmatchdesafios.conversormoedas;

public class ConversorMoedas implements ConversaoFinanceira {

    @Override
    public void converterDolarParaReal(double valorEmDolar) {
        double valorConvertido;

        valorConvertido = valorEmDolar * 5.64;

        System.out.println("A Conversão de: $ " + valorEmDolar + " Dólares para Real: R$ " + valorConvertido);
    }
}