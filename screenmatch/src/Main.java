import br.com.alura.screenmatch.calculations.RecommendationFilter;
import br.com.alura.screenmatch.calculations.TimeCalculator;
import br.com.alura.screenmatch.models.Episode;
import br.com.alura.screenmatch.models.Film;
import br.com.alura.screenmatch.models.Serie;

import java.sql.Time;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Film myFilm = new Film();
        myFilm.setName("The Big Boss");
        myFilm.setReleaseYear(1970);
        myFilm.setDurationInMinutes(180);

        myFilm.viewTechnicalSheet();

        myFilm.rate(8);
        myFilm.rate(5);
        myFilm.rate(10);

        //System.out.println(myFilm.sumRating);
        //System.out.println(myFilm.totalRating);
        System.out.println("Total de avaliações: " + myFilm.getTotalRating());
        System.out.println(myFilm.calculateAverage());

        Serie lost = new Serie();
        lost.setName("Lost");
        lost.setReleaseYear(2000);
        lost.viewTechnicalSheet();
        lost.setSeasons(10);
        lost.setEpisodesInSeason(10);
        lost.setEpisodeDurationMinutes(50);
        System.out.println("Duração para maratonar Lost: " + lost.getDurationInMinutes());

        Film otherFilm = new Film();
        otherFilm.setName("Avatar");
        otherFilm.setReleaseYear(2023);
        otherFilm.setDurationInMinutes(200);

        TimeCalculator calculator = new TimeCalculator();
        calculator.include(myFilm);
        calculator.include(otherFilm);
        calculator.include(lost);
        System.out.println(calculator.getTotalTime());

        RecommendationFilter filtrar = new RecommendationFilter();
        filtrar.filter(myFilm);

        Episode episode = new Episode();
        episode.setNumber(1);
        episode.setSerie(lost);
        episode.setTotalViews(300);
        filtrar.filter(episode);

        var filmeDoPaulo = new Film();
        filmeDoPaulo.setDurationInMinutes(200);
        filmeDoPaulo.setName("Dogville");
        filmeDoPaulo.setReleaseYear(2003);
        filmeDoPaulo.rate(10);

        ArrayList<Film> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(myFilm);
        listaDeFilmes.add(otherFilm);

        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        System.out.println("Primeiro Filme: " + listaDeFilmes.get(0));
        System.out.println(listaDeFilmes);
    }
}
