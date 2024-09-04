package br.com.guru.screenmatchdesafios.contabancaria;

public class ContaBancaria {

    public String titular;
    private int numeroConta;
    protected Double saldo = 0.0;

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(Double valorDeposito) {
        if (valorDeposito >= 0) {
            saldo += valorDeposito;
            System.out.println("\nDepósito de R$ " + valorDeposito + " reais realizado com sucesso!");
        } else {
            System.out.println("Erro! Por Favor, O valor precisa ser maior que zero!");
        }
    }

    public void sacar(Double valorSaque) {
        if (valorSaque <= saldo) {
            saldo -= valorSaque;
            System.out.println("Sucesso! Saque de R$ " + valorSaque + " Reais foi realizado com sucesso! \nSeu saldo atual: R$ " + saldo + " Reais");
        } else {
            System.out.println("Erro! O valor do saque é maior que o seu saldo disponível!");
        }
    }

    public void consultarSaldo() {
        System.out.println("Saldo Atual: R$ " + saldo + " Reais");
    }
}