package com.gotgame.got_game.m;

import java.util.ArrayList;

/**
 * Created by sento on 20/10/2016.
 */

public class Character {

    private int idCharacter;
    private ArrayList<String> hardName;
    private ArrayList<String> softName;

    public Character(int idCharacter, ArrayList<String> hardName) {
        this.idCharacter = idCharacter;
        this.hardName = hardName;
    }

    public Character(int idCharacter, ArrayList<String> hardName, ArrayList<String> softName) {
        this.idCharacter = idCharacter;
        this.hardName = hardName;
        this.softName = softName;
    }

    private int getIdCharacter() {
        return idCharacter;
    }

    private void setIdCharacter(int idCharacter) {
        this.idCharacter = idCharacter;
    }

    public ArrayList<String> getHardName() {
        return hardName;
    }

    public void setHardName(ArrayList<String> hardName) {
        this.hardName = hardName;
    }

    public ArrayList<String> getSoftName() { return softName; }

    public void setSoftName(ArrayList<String> softName) {
        this.softName = softName;
    }
}
