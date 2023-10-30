package barreto.fillipe.screenmatch.modelos.calculos;
import barreto.fillipe.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {

    private int tempoTotal;

    public int getTempoTotal() {
        return this.tempoTotal;
    }
// não precisa:
//    public void inclui (Filme f){
//        this.tempoTotal += f.getDuracaoEmMinutos();
//    }
//
//    public void inclui (Serie s){
//        this.tempoTotal += s.getDuracaoEmMinutos();
//    }

    public void inclui (Titulo t){
        this.tempoTotal += t.getDuracaoEmMinutos();
    }

}
