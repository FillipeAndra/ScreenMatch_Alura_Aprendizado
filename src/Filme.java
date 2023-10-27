public class Filme {
    private String nome = "não informado";
    private int anoDeLancamento = 0;
    private boolean incluidoNoPlano = false;
    private double somaAvaliacao = 0;
    private int totalDeAvaliacoes = 0;
    private int duracaoEmMinutos = 0;


    String getNome(){
        return nome;
    }

    void setNome(String nomeacao){
        //testando se é diferente
        if(!nomeacao.equals("")){
            nome = nomeacao;
        }
    }

    int getAnoDeLancamento(){
        return anoDeLancamento;
    }

    void setAnoDeLancamento(int ano){
        anoDeLancamento = ano;
    }

    boolean getIncluidoNoPlano(){
        return incluidoNoPlano;
    }

    void setIncluidoNoPlano(boolean plano){
        incluidoNoPlano = plano;
    }

    int getDuracaoEmMinutos(){
        return duracaoEmMinutos;
    }

    void setDuracaoEmMinutos(int duracao){
        duracaoEmMinutos = duracao;
    }

    void exibeFichaTecnica(){
        System.out.println("Nome do filme: "+nome);
        System.out.println("Ano de lançamento: "+anoDeLancamento);
        System.out.println("Tempo de duração: "+duracaoEmMinutos+" minutos");

    }

    void avalia(double nota){
        somaAvaliacao += nota;
        totalDeAvaliacoes++;

    }

    protected String mediaAvaliacao(){
        double media = somaAvaliacao / totalDeAvaliacoes;
        String retornoMedia = String.format("%.2f", media);
        return  retornoMedia;
    }
}
