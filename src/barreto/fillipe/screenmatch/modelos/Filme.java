package barreto.fillipe.screenmatch.modelos;

import barreto.fillipe.screenmatch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String diretor = "Não delcarado";

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
}
