package br.com.alura.screenmatch.main;

import br.com.alura.screenmatch.models.Film;
import br.com.alura.screenmatch.models.Serie;
import br.com.alura.screenmatch.models.Title;

import java.util.*;

public class MainWithList {
    public static void main(String[] args) {
        Film favorite = new Film("The Matrix", 1999);
        favorite.rate(10);

        Film outro = new Film("John Wick", 2014);
        outro.rate(9);

        Serie serie = new Serie("La Casa de Papel", 2017);

        List<Title> lista = new LinkedList<>();
        lista.add(favorite);
        lista.add(outro);
        lista.add(serie);

        for(Title item : lista) {
            System.out.println("Nome: " +item.getName());
            if (item instanceof Film filme && filme.getClassification() > 2) {
                System.out.println("Classificação: " + filme.getClassification());
            }
        }

        ArrayList<String> searchArtist = new ArrayList<>();
        searchArtist.add("Adam Sandler");
        searchArtist.add("Paul Walker");
        searchArtist.add("Brad Pitt");
        System.out.println(searchArtist);

        Collections.sort(searchArtist);
        System.out.println("Depois da ordenação:");
        System.out.println(searchArtist);

        System.out.println("Lista de titulos ordenados");
        Collections.sort(lista);
        System.out.println(lista);
        lista.sort(Comparator.comparing(Title::getReleaseYear));
        System.out.println("Ordenando por ano!");
        System.out.println(lista);
    }
}
