import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.model.Episodio;
import br.com.alura.screenmatch.model.Filme;
import br.com.alura.screenmatch.model.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        Filme favorito = new Filme("The Matrix", 1999);
        favorito.setDuracaoEmMinutos(135);
        favorito.setIncluidoNoPlano(true);

        Filme outroFilme = new Filme("John Wick", 2014);
        outroFilme.setDuracaoEmMinutos(101);
        outroFilme.setIncluidoNoPlano(true);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(favorito);
        listaDeFilmes.add(outroFilme);

        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        System.out.println("Primeiro Filme: " + listaDeFilmes.get(0));
        System.out.println(listaDeFilmes);

    }
}