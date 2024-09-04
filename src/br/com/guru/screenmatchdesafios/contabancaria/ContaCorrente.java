package br.com.guru.screenmatchdesafios.contabancaria;

public class ContaCorrente extends ContaBancaria {

    public void cobrarTarifaMensal() {
        double valorTarifaMensal = 0.10;
        saldo -= valorTarifaMensal;
        System.out.println("Saldo Atual: R$ " + saldo + " reais");
    }
}