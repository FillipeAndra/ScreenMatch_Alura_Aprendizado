import barreto.fillipe.screenmatch.modelos.Filme;

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
    }
}