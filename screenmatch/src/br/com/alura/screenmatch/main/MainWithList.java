package br.com.alura.screenmatch.main;

import br.com.alura.screenmatch.models.Film;
import br.com.alura.screenmatch.models.Serie;
import br.com.alura.screenmatch.models.Title;

import java.util.ArrayList;

public class MainWithList {
    public static void main(String[] args) {
        Film favorito = new Film("The Matrix", 1999);
        favorito.rate(10);

        Film outro = new Film("John Wick", 2014);
        outro.rate(9);

        Serie serie = new Serie("La Casa de Papel", 2017);

        ArrayList<Title> lista = new ArrayList<>();
        lista.add(favorito);
        lista.add(outro);
        lista.add(serie);

        for(Title item : lista) {
            System.out.println("Nome: " +item.getName());
            if (item instanceof Film filme && filme.getClassification() > 2) {
                System.out.println("Classificação: " + filme.getClassification());
            }
        }
    }
}
