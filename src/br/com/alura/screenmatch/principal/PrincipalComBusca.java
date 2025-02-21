package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.excecao.ErroDeConversaoDeAnoException;
import br.com.alura.screenmatch.model.Titulo;
import br.com.alura.screenmatch.model.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner scanner = new Scanner(System.in);
        String busca = "";
        List<Titulo> titulos = new ArrayList<>();
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        while (!busca.equalsIgnoreCase("sair")) {
            System.out.println("Digite um filme para busca: ");
            busca = scanner.nextLine();

            if (busca.equalsIgnoreCase("sair")) {
                break;
            }

            String chave = "1b7106e";
            String endereco = "https://www.omdbapi.com/?t=" + busca.replace(" ", "+") + "&apikey=" + chave;

            try {
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
                HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

                String json = response.body();
                System.out.println(json);
                TituloOmdb tituloOmdb = gson.fromJson(json, TituloOmdb.class);
                Titulo titulo = new Titulo(tituloOmdb);
                titulos.add(titulo);
            } catch (NumberFormatException e) {
                System.err.println("Data inválida: " + e.getMessage());
            } catch (ErroDeConversaoDeAnoException e) {
                System.err.println(e.getMensagem());
            } catch (IOException e) {
                System.err.println("Erro genérico: " + e.getMessage());
            }
        }

        File file = new File("filmes.json");
        FileWriter writer = new FileWriter(file);
        writer.write(gson.toJson(titulos));
        writer.close();

        System.out.println("O programa finalizou corretamente.");
    }
}
