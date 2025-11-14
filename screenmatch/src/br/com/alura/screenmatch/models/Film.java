package br.com.alura.screenmatch.models;

import br.com.alura.screenmatch.calculations.Classifiable;

public class Film extends Title implements Classifiable {
    private String director;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClassification() {
        return (int) calculateAverage() / 2;
    }
}
