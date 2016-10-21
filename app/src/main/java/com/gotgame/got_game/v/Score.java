package com.gotgame.got_game.v;

/**
 * Created by sento on 20/10/2016.
 */

public abstract class Score {

    private int nbShot;
    private int nbCS;

    public Score(int nbShot, int nbCS) {
        this.nbShot = nbShot;
        this.nbCS = nbCS;
    }

    public int getNbShot() {
        return nbShot;
    }

    public void setNbShot(int nbShot) {
        this.nbShot = nbShot;
    }

    public int getNbCS() {
        return nbCS;
    }

    public void setNbCS(int nbCS) {
        this.nbCS = nbCS;
    }
}
