package barreto.fillipe.screenmatch.principal;
import barreto.fillipe.screenmatch.modelos.Titulo;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

import barreto.fillipe.screenmatch.modelos.TituloOMDb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Qual filme você quer perquisar? ");
        var busca = leitor.nextLine(); //ele já infere que é String
        List<String> lista = new ArrayList<String>(Arrays.asList(busca.split("")));
        for(int i =0; i < lista.size(); i++){
            if ((lista.get(i)).equals(" ")){
                lista.set(i,"");
            }
        }
        busca = String.join("",lista);
        try{
        String endereco = "http://www.omdbapi.com/?t=" +busca+ "&apikey=8a99a6c7";

        HttpClient client = HttpClient.newHttpClient(); //cria o cliente que fará a requisição
        //do servidor da API

        HttpRequest request = HttpRequest.newBuilder() //constroi a requisição
                .uri(URI.create(endereco))
                .build();

        HttpResponse<String> response = client // envia a requisição
                .send(request, HttpResponse.BodyHandlers.ofString());

        // será adicionado também uma biblioteca para transformar o arquivo JSON de retorno
        // em uma classe java (a biblioteca utilizada é a GSON )
        String json = response.body();
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .create();

        TituloOMDb tituloOMDb = gson.fromJson(json,TituloOMDb.class);//transforma de JSON para record título
        System.out.println(tituloOMDb);

            Titulo titulo = new Titulo(tituloOMDb);
            System.out.println(titulo);
        }catch(IllegalArgumentException e){
            System.out.println("algo foi digitado errado");
        }

    }
}
