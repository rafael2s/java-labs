package br.com.alura.screenmatch.models;

public class Film {
    private String name;
    private int releaseYear;
    private boolean isIncludeInPlan;
    private double sumRating;
    private int totalRating;
    private int durationInMinutes;

    public String getName() {
        return name;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public boolean isIncludeInPlan() {
        return isIncludeInPlan;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public int getTotalRating(){
        return totalRating;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setIncludeInPlan(boolean includeInPlan) {
        isIncludeInPlan = includeInPlan;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public void viewTechnicalSheet() {
        System.out.println("Nome do filme: " + name);
        System.out.println("Ano de lançamento: " + releaseYear);
        System.out.println("Duração do filme: " + durationInMinutes);
    }

    public void rate(double note) {
        sumRating += note;
        totalRating++;
    }

    public double calculateAverage(){
        return sumRating / totalRating;
    }
}
