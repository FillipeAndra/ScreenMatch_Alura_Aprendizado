import barreto.fillipe.screenmatch.modelos.Filme;
import barreto.fillipe.screenmatch.modelos.Serie;
import barreto.fillipe.screenmatch.modelos.calculos.CalculadoraDeTempo;

public class Principal {
    public static void main (String[] args){
        Filme filme1 = new Filme();
        filme1.setNome("O poderoso chefão");
        filme1.setAnoDeLancamento(1970);
        filme1.setDuracaoEmMinutos(180);

        filme1.exibeFichaTecnica();
        filme1.avalia(8.5);
        filme1.avalia(6);
        filme1.avalia(5.5);
        System.out.printf(filme1.mediaAvaliacao());

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
    }
}