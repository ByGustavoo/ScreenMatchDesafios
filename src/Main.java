import br.com.guru.screenmatchdesafios.aluno.Aluno;
import br.com.guru.screenmatchdesafios.calculadora.Calculadora;
import br.com.guru.screenmatchdesafios.carro.Carro;
import br.com.guru.screenmatchdesafios.musica.Musica;
import br.com.guru.screenmatchdesafios.pessoa.Pessoa;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n********* Desafios ********* \n ");

        Pessoa pessoa = new Pessoa();
        pessoa.helloWorld();

        System.out.println("**************************** \n ");

        Calculadora calculadora = new Calculadora();
        calculadora.dobroDoNumero(10);

        System.out.println("**************************** \n ");

        Musica musica = new Musica();
        musica.setTitulo("Camaro Amarelo");
        musica.setArtista("Guru");
        musica.setAnoDeLancamento(2011);

        musica.avaliarMusica(8);
        musica.avaliarMusica(9);
        musica.avaliarMusica(10);

        musica.exibirFichaTecnica();
        musica.mediaDasAvaliacoes();

        System.out.println("\n**************************** \n ");

        Carro carro = new Carro();
        carro.setModelo("Civic");
        carro.setCor("Cinza");
        carro.setAno(2020);

        carro.exibirFichaTecnica();
        carro.calcularIdadeCarro();

        System.out.println("\n**************************** \n ");

        Aluno aluno = new Aluno();
        aluno.setNome("Guruzinho");
        aluno.setIdade(19);
        aluno.exibirInformacoes();

        System.out.println("\n**************************** \n ");
    }
}