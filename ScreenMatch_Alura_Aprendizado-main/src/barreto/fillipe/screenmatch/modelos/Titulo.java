package barreto.fillipe.screenmatch.modelos;

public class Titulo implements Comparable<Titulo>{
    private String nome = "não informado";
    private int anoDeLancamento = 0;
    private boolean incluidoNoPlano = false;
    private double somaAvaliacao = 0;
    private int totalDeAvaliacoes = 0;
    private int duracaoEmMinutos = 0;


    // cada filha de uma classe mãe tem que tem seus construtores
    // só fazer um construtor que bata com o da classe mãe, chamando o super com o que tem no da mãe
    // ou fazer o último, adicionando novas entradas
    public Titulo(String nome, int ano){
        if(nome.isEmpty()){
            this.nome = "criado sem nome";
        }
        this.nome = nome ;
        this.anoDeLancamento = ano;

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
}
