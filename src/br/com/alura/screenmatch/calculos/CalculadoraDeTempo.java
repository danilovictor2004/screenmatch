package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.model.Titulo;

public class CalculadoraDeTempo {

    private int tempoTotal;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

    public void inclui (Titulo titulo) {
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }

}
