package barreto.fillipe.screenmatch.principal;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Qual filme você quer perquisar?");
        var busca = leitor.nextLine(); //ele já infere que é String
        String endereco = "http://www.omdbapi.com/?t=" +busca+ "&apikey=8a99a6c7";

        HttpClient client = HttpClient.newHttpClient(); //cria o cliente que fará a requisição
        //do servidor da API

        HttpRequest request = HttpRequest.newBuilder() //constroi a requisição
                .uri(URI.create(endereco))
                .build();

        HttpResponse<String> response = client // envia a requisição
                .send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body()); // retorna o JSON da resposta
    }
}
