package barreto.fillipe.screenmatch.modelos;
import barreto.fillipe.screenmatch.calculos.CalculadoraDeTempo;

public class Serie extends Titulo {
    private int temporadas;
    private boolean ativa;
    private int episodiosPorTemporadas;
    private int minutosPorEpisodios;

    public Serie(String nome, int ano, int temporadas, int episodios, int minutos) {
        super(nome, ano);
        this.temporadas = temporadas;
        this.episodiosPorTemporadas = episodios;
        this.minutosPorEpisodios = minutos;

    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public boolean getAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getEpisodiosPorTemporadas() {
        return episodiosPorTemporadas;
    }

    public void setEpisodiosPorTemporadas(int episodiosPorTemporadas) {
        this.episodiosPorTemporadas = episodiosPorTemporadas;
    }

    public int getMinutosPorEpisodios() {
        return minutosPorEpisodios;
    }

    public void setMinutosPorEpisodios(int minutosPorEpisodios) {
        this.minutosPorEpisodios = minutosPorEpisodios;
    }

    @Override
    public int getDuracaoEmMinutos() {
        return temporadas * episodiosPorTemporadas * minutosPorEpisodios;
    }

    @Override
    public String toString(){
        return "Série: "+ this.getNome() + ", tempo total de duração: " + this.getDuracaoEmMinutos() + " minutos" +" (" + this.getAnoDeLancamento()+")";
    }

}
