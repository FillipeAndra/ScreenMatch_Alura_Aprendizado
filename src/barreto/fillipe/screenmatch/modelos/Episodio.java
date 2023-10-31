package barreto.fillipe.screenmatch.modelos;

import barreto.fillipe.screenmatch.calculos.Classificavel;

public class Episodio implements Classificavel {
    private int numero;
    private String Nome;

    private Serie serie;

    private int totalVisualizacoes;
    public int getNumero() {
        return numero;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getNome() {
        return Nome;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    @Override
    public int getClassificacao() {
        if(totalVisualizacoes > 100){
            return 4;
        }else{
            return 0;
        }
    }
}
