import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.model.Filme;
import br.com.alura.screenmatch.model.Serie;

public class Principal {
    public static void main(String[] args) {

        Filme favorito = new Filme();
        favorito.setNome("The Matrix");
        favorito.setAnoDeLancamento(1999);
        favorito.setDuracaoEmMinutos(135);
        favorito.setIncluidoNoPlano(true);

        Filme outroFilme = new Filme();
        outroFilme.setNome("John Wick");
        outroFilme.setAnoDeLancamento(2014);
        outroFilme.setDuracaoEmMinutos(101);
        outroFilme.setIncluidoNoPlano(true);

        Serie serie = new Serie();
        serie.setNome("La Casa de Papel");
        serie.setAnoDeLancamento(2017);
        serie.setIncluidoNoPlano(true);
        serie.setAtiva(true);
        serie.setTemporadas(5);
        serie.setEpisodiosPorTemporada(10);
        serie.setMinutosPorEpisodio(45);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(favorito);
        calculadora.inclui(outroFilme);
        calculadora.inclui(serie);

        System.out.printf("Tempo total: %d", calculadora.getTempoTotal());

    }
}