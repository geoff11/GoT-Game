package com.gotgame.got_game.v;

import com.gotgame.got_game.m.Group;

/**
 * Created by sento on 20/10/2016.
 */

public class ScoreGroup extends Score {

    private Group group;

    public ScoreGroup(int nbShot, int nbCS, Group group) {
        super(nbShot, nbCS);
        this.group = group;
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
