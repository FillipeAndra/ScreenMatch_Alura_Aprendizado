package barreto.fillipe.screenmatch.principal;

import barreto.fillipe.screenmatch.calculos.FiltroRecomendacao;
import barreto.fillipe.screenmatch.modelos.Episodio;
import barreto.fillipe.screenmatch.modelos.Filme;
import barreto.fillipe.screenmatch.modelos.Serie;
import barreto.fillipe.screenmatch.calculos.CalculadoraDeTempo;


import java.util.ArrayList;


public class Principal {
    public static void main (String[] args){

        Filme filme1 = new Filme("O poderoso chefão",1970,180);
        filme1.exibeFichaTecnica();
        filme1.avalia(8.5);
        filme1.avalia(7);
        filme1.avalia(9.5);
        System.out.println(filme1.mediaAvaliacao());

        Serie lost = new Serie("Lost",2000, 10,10,50);
        lost.exibeFichaTecnica();
        System.out.println("Duração para maratonar lost: "+lost.getDuracaoEmMinutos()+" minutos");

        Filme filme2 = new Filme("Avatar: O caminho da água",2022, 200);


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


        Filme ExpressoPolar = new Filme("Expresso Polar",2004, 100);
        ExpressoPolar.avalia(6);



    }
}