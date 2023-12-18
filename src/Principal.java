import barreto.fillipe.screenmatch.calculos.FiltroRecomendacao;
import barreto.fillipe.screenmatch.modelos.Episodio;
import barreto.fillipe.screenmatch.modelos.Filme;
import barreto.fillipe.screenmatch.modelos.Serie;
import barreto.fillipe.screenmatch.calculos.CalculadoraDeTempo;


import java.util.ArrayList;


public class Principal {
    public static void main (String[] args){
        Filme filme1 = new Filme();
        filme1.setNome("O poderoso chefão");
        filme1.setAnoDeLancamento(1970);
        filme1.setDuracaoEmMinutos(180);

        filme1.exibeFichaTecnica();
        filme1.avalia(8.5);
        filme1.avalia(7);
        filme1.avalia(9.5);
        System.out.println(filme1.mediaAvaliacao());

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporadas(10);
        lost.setMinutosPorEpisodios(50);
        System.out.println("Duração para maratonar lost: "+lost.getDuracaoEmMinutos()+" minutos");

        Filme filme2 = new Filme();
        filme2.setNome("Avatar: O caminho da água");
        filme2.setAnoDeLancamento(2022);
        filme2.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(filme1);
        calculadora.inclui(filme2);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(filme1);

        Episodio primeiroLost = new Episodio();
        primeiroLost.setNumero(1);
        primeiroLost.setSerie(lost);
        primeiroLost.setTotalVisualizacoes(300);
        filtro.filtra(primeiroLost);


        Filme ExpressoPolar = new Filme();
        ExpressoPolar.setNome("Expresso Polar");
        ExpressoPolar.setDuracaoEmMinutos(100);
        ExpressoPolar.setAnoDeLancamento(2004);
        ExpressoPolar.avalia(6);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(ExpressoPolar);
        listaDeFilmes.add(filme1);
        listaDeFilmes.add(filme2);
        System.out.println("Tamanho da lista: "+ listaDeFilmes.size());
        System.out.println("Primeiro item da lista: "+ listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);

    }
}