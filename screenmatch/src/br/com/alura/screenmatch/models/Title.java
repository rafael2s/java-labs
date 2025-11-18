package br.com.alura.screenmatch.models;

import br.com.alura.screenmatch.excessao.ErrorDeConversaoDeAnaException;
import com.google.gson.annotations.SerializedName;

public class Title implements Comparable<Title> {
    private String name;
    private int releaseYear;
    private boolean isIncludeInPlan;
    private double sumRating;
    private int totalRating;
    private int durationInMinutes;

    public Title(String name, int releaseYear) {
        this.name = name;
        this.releaseYear = releaseYear;
    }

    public Title(TitleOmdb myTitleOmdb) {
        this.name = myTitleOmdb.title();
        if(myTitleOmdb.year().length() > 4) {
            throw new ErrorDeConversaoDeAnaException("Não consegui converter o ano, porque tem mais de 04 caracteres!");
        }
        this.releaseYear = Integer.valueOf(myTitleOmdb.year());
        this.durationInMinutes = Integer.valueOf(myTitleOmdb.runtime().substring(0,2));
    }

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
    }

    public void rate(double note) {
        sumRating += note;
        totalRating++;
    }

    public double calculateAverage(){
        return sumRating / totalRating;
    }

    @Override
    public int compareTo(Title anotherTitle) {
        return this.getName().compareTo(anotherTitle.getName());
    }

    @Override
    public String toString() {
        return "(name = " + name +
                ", releaseYear = " + releaseYear + "," +
                " duration = " + durationInMinutes + ")";
    }
}
