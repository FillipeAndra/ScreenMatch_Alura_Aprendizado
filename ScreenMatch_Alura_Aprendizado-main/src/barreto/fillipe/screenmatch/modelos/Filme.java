package barreto.fillipe.screenmatch.modelos;

import barreto.fillipe.screenmatch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {

    // os metodos consttutores servem para auxiliar na hora de criação de um objeto
    // fazendo com estes tenham os valores já setados no seu momento de escrita

    // o java criar altomaticamente o método de criação default
    // em que nele não se recebe, nem se faz nada

    // é possível você criar um método que replique o default
    // em conjunto com outro mpetodo construtor para fazer com que
    // o preenchimento dos atributos no momento de criação do objeto
    // seja opcional

    // podem haver mais de um método construtor em uma classe

    // quando se cria os métodos construtores é bom se questionar a necessidade
    // dos métodos setters. Caso fique na dúvida não coloque os métodos setters
    // por uma questão de controle



    private String diretor = "Não delcarado";

    public Filme(String nome, int ano, int minutos) {
        super(nome, ano);
        this.setDuracaoEmMinutos(minutos);
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao(){
        return (int) mediaAvaliacao() /2;
    }

    // toString é um método presente em diversas classes do java e
    // nela está a forma como a classe deve ser impressa em string
    // para dar um retorno
    @Override
    public String toString(){
        return "Filme: " + this.getNome() + ", tempo de duração: " + this.getDuracaoEmMinutos() +" minutos" + " ("+this.getAnoDeLancamento()+")";
    }
}
