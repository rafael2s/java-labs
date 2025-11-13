public class Film {
    String name;
    int releaseYear;
    boolean isIncludeInPlan;
    double sumRating;
    int totalRating;
    int durationInMinutes;

    void viewTechnicalSheet() {
        System.out.println("Nome do filme: " + name);
        System.out.println("Ano de lançamento: " + releaseYear);
        System.out.println("Duração do filme: " + durationInMinutes);
    }

    void rate(double note) {
        sumRating += note;
        totalRating++;
    }

    double calculateAverage(){
        return sumRating / totalRating;
    }
}
