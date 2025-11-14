import br.com.alura.screenmatch.models.Film;

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
    }
}
