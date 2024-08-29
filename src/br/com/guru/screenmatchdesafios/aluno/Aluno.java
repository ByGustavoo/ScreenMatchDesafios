package br.com.guru.screenmatchdesafios.aluno;

public class Aluno {

    private  String nome;
    private int idade;

    public void exibirInformacoes() {
        System.out.println("Nome do Aluno: " + nome);
        System.out.println("Idade do Aluno: " + idade);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}