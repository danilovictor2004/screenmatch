package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.model.Filme;
import br.com.alura.screenmatch.model.Serie;
import br.com.alura.screenmatch.model.Titulo;

import java.util.ArrayList;

public class PrincipalComLista {
    public static void main(String[] args) {

        Filme favorito = new Filme("The Matrix", 1999);
        favorito.avalia(10);

        Filme outroFilme = new Filme("John Wick", 2014);
        outroFilme.avalia(9);

        Serie serie = new Serie("La Casa de Papel", 2017);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(favorito);
        lista.add(outroFilme);
        lista.add(serie);

        for (Titulo item : lista) {
            System.out.println("Nome: "+ item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }

    }
}
