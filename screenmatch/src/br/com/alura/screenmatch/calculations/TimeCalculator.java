package br.com.alura.screenmatch.calculations;

import br.com.alura.screenmatch.models.Title;

public class TimeCalculator {
    private int totalTime = 0;

    public int getTotalTime() {
        return totalTime;
    }

//    public void include(Film f){
//        totalTime += f.getDurationInMinutes();
//    }
//
//    public void include(Serie s){
//        totalTime += s.getDurationInMinutes();
//    }

    public void include(Title title){
        System.out.println("Add. duration in minutes: " + title.getName() + " " + title.getDurationInMinutes());
        this.totalTime += title.getDurationInMinutes();
    }
}
