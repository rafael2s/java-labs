package br.com.alura.screenmatch.models;

public class Serie extends Title  {
    private int seasons;
    private boolean isActive;
    private int episodesInSeason;
    private int episodeDurationMinutes;

    public Serie(String name, int releaseYear) {
        super(name, releaseYear);
    }

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public int getEpisodesInSeason() {
        return episodesInSeason;
    }

    public void setEpisodesInSeason(int episodesInSeason) {
        this.episodesInSeason = episodesInSeason;
    }

    public int getEpisodeDurationMinutes() {
        return episodeDurationMinutes;
    }

    public void setEpisodeDurationMinutes(int episodeDurationMinutes) {
        this.episodeDurationMinutes = episodeDurationMinutes;
    }

    @Override
    public int getDurationInMinutes() {
        return seasons * episodesInSeason * episodeDurationMinutes;
    }
}
