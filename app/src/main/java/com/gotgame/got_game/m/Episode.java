package com.gotgame.got_game.m;

import java.io.File;

/**
 * Created by sento on 20/10/2016.
 */

public class Episode {

    private int number;
    private int season;
    private File subtitles;

    public Episode(int number, int season) {
        this.number = number;
        this.season = season;
    }

    public Episode(int number, int season, File subtitles) {
        this.number = number;
        this.season = season;
        this.subtitles = subtitles;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getSeason() {
        return season;
    }

    public void setSeason(int season) {
        this.season = season;
    }

    public File getSubtitles() {
        return subtitles;
    }

    public void setSubtitles(File subtitles) {
        this.subtitles = subtitles;
    }
}
