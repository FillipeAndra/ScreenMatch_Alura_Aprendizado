package barreto.fillipe.screenmatch.principal;

import barreto.fillipe.screenmatch.modelos.Filme;
import barreto.fillipe.screenmatch.modelos.Serie;
import barreto.fillipe.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class  PrincipalComListas {
    public static void main(String[] args) {

        // ArrayList vem de List que é ua das collections mais usadas
        Filme filme1 = new Filme("O poderoso chefão",1970, 180);
        filme1.avalia(9);
        Serie lost = new Serie("Lost",2000, 10,10,50);
        Filme filme2 = new Filme("Avatar: O caminho da água",2022, 200);
        filme2.avalia(7);
        Filme ExpressoPolar = new Filme("Expresso Polar",2004, 100);
        ExpressoPolar.avalia(4);

        // referência ao filme expresso polar (apenas aponta para o objeto criado na memória ela não contem
        // os seus dados, quando se aplica um método a ele
        // como ele aponta para o original, o método é aplicado ao objeto
        Filme filme3 = ExpressoPolar;



        //um objeto não aponta para si mesmo (ele não é uma referência)


        //ArrayList<Titulo> listaDeAssistidos = new ArrayList<>();
        List<Titulo> listaDeAssistidos = new LinkedList<>(); //linkedlist é mais rápido e List é uma ‘interface’,
        // então posso chamar que implementa ela, podendo mudar essa segunda parte apara qualquer classe que
        // implementa list

        // Arraylist ele é uma array que consegue variar de tamanho aumentadno e diminuindo a depender
        // da quantidade de itens nele e a variação disso

        // LinkedList é baseado numa lista encadeada, onde cada elemento da lista é um objeto
        // com referência ao próximo elemento da lista, tem uma pesquisa de lementos específicos da lista
        // menos eficientes (mais escolhido caso só precise inserir e retirar itens com frequencia, sem
        // precisar fazer pesquisa sem saber o index)

        // 'Vector' pode ser usado em caso de threads concorrentes, só que a depender da
        // situação ele é mais lento que uma Arraylist

        // Stack é uma pilha (favor estudar estrutura de dados), que há adicção e remoção nos extremos da lista
        // com o método LIFO ("last-in", First-out)

        // Hashmap é a implementação da ‘interface’ map, onde por meio de chaves associadas em uma tabela hash,
        // ele liga as chaves ao conteudo desejado, não precisando saber o index para achar o que se quer
        // apenas é necesário saber a chave. (Seu desenpenho são depende do tamanho da coleção de dados)
        // ela não garante uma ordem que se mnatem constante
        // Ele funciona como uma biblioteca de python

        // Hashset é a implementação da 'interface' 'set' com uma tabela hash
        // também não garante a ordem da lista, mas permite dados com valores null
        //funciona tal qual o Hashmap


        listaDeAssistidos.add(filme3);
        listaDeAssistidos.add(filme1);
        listaDeAssistidos.add(filme2);
        listaDeAssistidos.add(lost);

        //A biblioteca collections.sort não funciona para uma classe criada que tenha varios dados como Titulo

        // para isso a classe tem queimplementar o comparable e aplicar as regras do compareTO (ver o javaDoc disso)

        Collections.sort(listaDeAssistidos); //não pode ficar num ‘loop’, pois vai ficar a comparar infinitamente

        for(Titulo item: listaDeAssistidos){
            System.out.println("Item da lista: "+item);
            if(item instanceof Filme filme && filme.getClassificacao() > 2){
              System.out.println("classificação de filmes: "+filme.getClassificacao());
            }
        }

        // ou pode ser feito com enhanced for com?

        // for (Titulo itemDaLista: listaDeAssistidos){
        //  System.out.println("Item da lista: "+itemDaLista);
        // }

        // ou

        // listaDeAssistidos.forEach(itamDaLista -> System.out.println("Item da lista: "+itemDaLista));

        //exemplo de ordenação de lista

        ArrayList<String> listaDeNomes = new ArrayList<>();
        listaDeNomes.add("Isafe");
        listaDeNomes.add("Fillipe");
        listaDeNomes.add("Bruno");
        listaDeNomes.add("Robert");
        Collections.sort(listaDeNomes); //cuidado collections é que tem métodos como o sort
        // a classe collection é quem está acima de List e que tem a base da estrutura para funcionar uma coleção
        // como uma array, uma ArrayList ou uma biblioteca
        System.out.println(listaDeNomes);



        listaDeAssistidos.sort(Comparator.comparing(Titulo::getAnoDeLancamento));// aqui força ele a comparar por ano,
        // ao invés de por data de lançamento, sem apagar ou mexer no compareTO que está na classe título
        for(Titulo item: listaDeAssistidos){
            System.out.println("Item da lista: "+item);
            if(item instanceof Filme filme && filme.getClassificacao() > 2){
                System.out.println("classificação de filmes: "+filme.getClassificacao());
            }
        }
    }
}
