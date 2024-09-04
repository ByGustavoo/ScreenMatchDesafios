import br.com.guru.screenmatchdesafios.aluno.Aluno;
import br.com.guru.screenmatchdesafios.animal.Animal;
import br.com.guru.screenmatchdesafios.animal.Cachorro;
import br.com.guru.screenmatchdesafios.animal.Gato;
import br.com.guru.screenmatchdesafios.calculadora.Calculadora;
import br.com.guru.screenmatchdesafios.calcular.CalculadoraSalaRetangular;
import br.com.guru.screenmatchdesafios.carro.Carro;
import br.com.guru.screenmatchdesafios.carro.ModeloCarro;
import br.com.guru.screenmatchdesafios.contabancaria.ContaBancaria;
import br.com.guru.screenmatchdesafios.contabancaria.ContaCorrente;
import br.com.guru.screenmatchdesafios.conversormoedas.ConversorMoedas;
import br.com.guru.screenmatchdesafios.idadepessoa.IdadePessoa;
import br.com.guru.screenmatchdesafios.livro.Livro;
import br.com.guru.screenmatchdesafios.musica.Musica;
import br.com.guru.screenmatchdesafios.pessoa.Pessoa;
import br.com.guru.screenmatchdesafios.produto.Produto;
import br.com.guru.screenmatchdesafios.tabuada.TabuadaMultiplicacao;

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

        IdadePessoa idadePessoa = new IdadePessoa();
        idadePessoa.setNome("Guruzao");
        idadePessoa.setIdade(19);
        idadePessoa.verificarIdade(idadePessoa.getIdade());


        System.out.println("\n**************************** \n ");

        Produto produto = new Produto();
        produto.setNome("Chocolate");
        produto.setPreco(50.00);
        System.out.println("Nome do Produto: " + produto.getNome());
        System.out.println("Preço do Produto sem Desconto: R$ " + produto.getPreco() + " Reais");
        produto.aplicarDesconto(50);

        System.out.println("\n**************************** \n ");

        aluno.calcularMedia(10, 10);

        System.out.println("\n**************************** \n ");

        Livro livro = new Livro();
        livro.setTitulo("Scrum, A arte de fazer o dobro, na metade do tempo");
        livro.setAutor("Jeff Sutherland");

        livro.exibirDetalhes();

        System.out.println("\n**************************** \n ");

        ModeloCarro modeloCarro = new ModeloCarro();
        modeloCarro.setModelo("Civic G10");
        modeloCarro.setValoresPorAno(19.99, 25.77, 27.17);
        modeloCarro.exibirInformacoes();

        System.out.println("\n**************************** \n ");

        Animal animal = new Animal();
        animal.emitirSom();

        Cachorro cachorro = new Cachorro();
        cachorro.emitirSom();
        cachorro.abanarRabo();

        Gato gato = new Gato();
        gato.emitirSom();
        gato.arranharMoveis();

        System.out.println("\n**************************** \n ");

        ContaBancaria contaBancaria = new ContaBancaria();
        contaBancaria.depositar(100.00);
        contaBancaria.consultarSaldo();

        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.depositar(2000.00);
        contaCorrente.cobrarTarifaMensal();
        contaCorrente.sacar(500.0);

        System.out.println("\n**************************** \n ");

        ConversorMoedas conversorMoedas = new ConversorMoedas();
        conversorMoedas.converterDolarParaReal(5.5);

        System.out.println("\n**************************** \n ");

        CalculadoraSalaRetangular calculadoraSalaRetangular = new CalculadoraSalaRetangular();
        calculadoraSalaRetangular.calcularArea(4, 5);
        calculadoraSalaRetangular.calcularPerimetro(4, 5);

        System.out.println("\n**************************** \n ");

        TabuadaMultiplicacao tabuadaMultiplicacao = new TabuadaMultiplicacao();
        tabuadaMultiplicacao.mostrarTabuada(5);


    }
}