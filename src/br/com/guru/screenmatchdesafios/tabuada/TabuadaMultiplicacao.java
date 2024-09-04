package br.com.guru.screenmatchdesafios.tabuada;

public class TabuadaMultiplicacao implements Tabuada {

    @Override
    public void mostrarTabuada(int numero) {
        System.out.println("Tabuada do Número: " + numero + "\n");

        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }
}