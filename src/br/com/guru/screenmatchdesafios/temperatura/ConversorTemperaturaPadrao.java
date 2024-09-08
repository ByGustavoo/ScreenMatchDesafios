package br.com.guru.screenmatchdesafios.temperatura;

import java.text.DecimalFormat;

public class ConversorTemperaturaPadrao implements ConversorTemperatura {

    DecimalFormat decimalFormat = new DecimalFormat("0.00");

    @Override
    public void celsiusParaFahrenheit(double valorEmCelsius) {
        double temperaturaFahrenheit = (valorEmCelsius * 1.8) + 32;

        String temperaturaFormatada = decimalFormat.format(temperaturaFahrenheit);

        String temperaturaFinal = temperaturaFormatada.replace(',', '.');

        System.out.println(valorEmCelsius + "°C em Fahrenheit: " + temperaturaFinal + "°F");
    }

    @Override
    public void fahrenheitParaCelsius(double valorEmFahrenheit) {
        double temperaturaCelsius = (valorEmFahrenheit - 32) * 5 / 9;

        String temperaturaFormatada = decimalFormat.format(temperaturaCelsius);

        String temperaturaFinal = temperaturaFormatada.replace(',', '.');

        System.out.println(valorEmFahrenheit + "°F em Celsius: " + temperaturaFinal + "°C");
    }
}