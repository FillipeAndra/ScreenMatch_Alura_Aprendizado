public class Principal {
    public static void main (String[] args){
        Filme filme1 = new Filme();
        filme1.nome = "O poderoso chefão";
        filme1.anoDeLancamento = 1970;
        filme1.duracaoEmMinutos = 180;

        filme1.exibeFichaTecnica();
        filme1.avalia(8.5);
        filme1.avalia(6);
        filme1.avalia(5.5);
        System.out.printf(filme1.mediaAvaliacao());
    }
}