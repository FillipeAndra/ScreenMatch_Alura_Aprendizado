package barreto.fillipe.screenmatch.calculos;

public class FiltroRecomendacao {
    private String reocemndacao;

    public void filtra(Classificavel classi){
        if(classi.getClassificacao() >= 4){
            System.out.println("Está entre os preferidos do momento");
        } else if(classi.getClassificacao() >=2){
            System.out.println("Muito bem avaliado no momento");
        }else{
            System.out.println("Pode adicionar para ver depois");
        }
    }
}
