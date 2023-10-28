package barreto.fillipe.screenmatch.modelos;

public class Filme {
    private String nome = "não informado";
    private int anoDeLancamento = 0;
    private boolean incluidoNoPlano = false;
    private double somaAvaliacao = 0;
    private int totalDeAvaliacoes = 0;
    private int duracaoEmMinutos = 0;


    public String getNome(){

        return this.nome;
    }

    public void setNome(String nomeacao){
        //testando se é diferente
        if(!nomeacao.equals("")){
            this.nome = nomeacao;
        }
    }

    public int getAnoDeLancamento(){

        return this.anoDeLancamento;
    }

    public void setAnoDeLancamento(int ano){

        this.anoDeLancamento = ano;
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

    public void setDuracaoEmMinutos(int duracao){

        this.duracaoEmMinutos = duracao;
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

    public String mediaAvaliacao(){
        double media = somaAvaliacao / totalDeAvaliacoes;
        String retornoMedia = String.format("%.2f", media);
        return  retornoMedia;
    }
}
