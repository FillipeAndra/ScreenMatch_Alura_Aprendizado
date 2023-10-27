public class Filme {
    String nome = "não informado";
    int anoDeLancamento = 0;
    boolean incluidoNoPlano = false;
    double somaAvaliacao = 0;
    int totalDeAvaliacoes = 0;
    int duracaoEmMinutos = 0;


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
