package com.gotgame.got_game.v;

import com.gotgame.got_game.m.Player;

/**
 * Created by sento on 20/10/2016.
 */

public class ScorePlayer extends Score {

    private Player player;

    public ScorePlayer(int nbShot, int nbCS, Player player) {
        super(nbShot, nbCS);
        this.player = player;
    }

    @Override
    public int getNbShot() {
        return super.getNbShot();
    }

    @Override
    public void setNbShot(int nbShot) {
        super.setNbShot(nbShot);
    }

    @Override
    public int getNbCS() {
        return super.getNbCS();
    }

    @Override
    public void setNbCS(int nbCS) {
        super.setNbCS(nbCS);
    }
}
