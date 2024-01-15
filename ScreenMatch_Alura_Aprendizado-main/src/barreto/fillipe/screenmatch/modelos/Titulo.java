package barreto.fillipe.screenmatch.modelos;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.regex.Pattern;
import java.util.Scanner;

public class Titulo implements Comparable<Titulo>{
    //@SerializedName("Title") // guia o que no arquivo json é correspondente na classe chamada
    //que irá armazenar o dado
    private String nome = "não informado";
    //@SerializedName("Year")
    private int anoDeLancamento = 0;
    private boolean incluidoNoPlano = false;
    private double somaAvaliacao = 0;
    private int totalDeAvaliacoes = 0;
    private int duracaoEmMinutos = 0;


    // cada filha de uma classe mãe tem que tem seus construtores
    // só fazer um construtor que bata com o da classe mãe, chamando o super com o que tem no da mãe
    // ou fazer o último, adicionando novas entradas
    public Titulo(String nome, int ano){
        this.nome = nome;
        this.anoDeLancamento = ano;

    }

    public Titulo(TituloOMDb tituloOMDb) {
        try {
            String[] duracaoOMDB = tituloOMDb.runtime().split(" ");
            String[] anoOMDB = tituloOMDb.year().split("");
            int teste;
            int duracao = 0;
            String ano = "";


            for (String item : duracaoOMDB) {
                try {
                    duracao = Integer.parseInt(item);

                } catch (NumberFormatException e) {
                    System.out.println("Erro na formatação do número da duração");
                }
            }

            for (String item : anoOMDB) {
                try {
                    teste = Integer.parseInt(item);
                    ano = ano + item;
                } catch (NumberFormatException e) {

                }
            }

            this.nome = tituloOMDb.title();
            this.anoDeLancamento = Integer.parseInt(ano);
            this.duracaoEmMinutos = duracao;
        }catch(NullPointerException e){
            System.out.println("Um dos valores não foi preenchido na base de dados");
        }
    }

    public String getNome(){

        return this.nome;
    }

    public int getAnoDeLancamento(){

        return this.anoDeLancamento;
    }

    public boolean getIncluidoNoPlano(){

        return this.incluidoNoPlano;
    }

    public void setIncluidoNoPlano(boolean plano){

        this.incluidoNoPlano = plano;
    }

    public int getDuracaoEmMinutos(){

        return this.duracaoEmMinutos;
    }

    protected void setDuracaoEmMinutos(int minutos){
        this.duracaoEmMinutos = minutos;
    }

    public void exibeFichaTecnica(){
        System.out.println("Nome do filme: "+this.nome);
        System.out.println("Ano de lançamento: "+this.anoDeLancamento);
        System.out.println("Tempo de duração: "+this.duracaoEmMinutos+" minutos");

    }

    public void avalia(double nota){
        this.somaAvaliacao += nota;
        this.totalDeAvaliacoes++;

    }

    public double mediaAvaliacao(){
        double media = somaAvaliacao / totalDeAvaliacoes;
        return  media;
    }

    // implementação do método compareTO
    // como a classe String já tem o compareTO implmentado ele é o que será utilizado
    @Override
    public int compareTo(Titulo outro) {
        //aqui ele está comparando o nome do atual titulo em analise com
        // o do "outro" que entrará no método
        return this.getNome().compareTo(outro.getNome());
    }

    // outra maneira de implementar o método compareTO e sua interface Comparale<> é:

    //@Override
    //public int compareTo(Titulo outroNome) {
    //    if (this.nome < outroNome.getNome()) {
    //        return -1;
    //    }
    //    if (this.nome > outroNome.getNome()) {
    //       return 1;
    //    }
    //    return 0;
    //}

    @Override
    public String toString(){
        return "("+"Titulo: "+this.nome+", duração: "+this.duracaoEmMinutos+" min"+"("+this.anoDeLancamento+")"+")";
    }
}
