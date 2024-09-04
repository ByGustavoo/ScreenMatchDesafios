package br.com.guru.screenmatchdesafios.aluno;

public class Aluno {

    private  String nome;
    private int idade;
    private double nota;

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

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public void calcularMedia(double nota1, double nota2) {
        double media;

        media = (nota1 + nota2) / 2;

        System.out.println("Média do Aluno: " + media);

    }
}