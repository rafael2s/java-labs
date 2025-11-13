public class Main {
    public static void main(String[] args) {
        Film myFilm = new Film();
        myFilm.name = "The Big Boss";
        myFilm.releaseYear = 1970;
        myFilm.durationInMinutes = 180;

        myFilm.viewTechnicalSheet();
        myFilm.rate(8);
        myFilm.rate(5);
        myFilm.rate(10);

        System.out.println(myFilm.sumRating);
        System.out.println(myFilm.totalRating);
        System.out.println(myFilm.calculateAverage());
    }
}
