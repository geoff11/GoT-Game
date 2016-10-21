package com.gotgame.got_game.m;

import java.lang.*;
import java.util.ArrayList;

/**
 * Created by sento on 20/10/2016.
 */

public class Group {

    private int idGroup;
    private String name;
    private ArrayList<Character> characters;

    public Group(int idGroup, String name, ArrayList<Character> characters) {
        this.idGroup = idGroup;
        this.name = name;
        this.characters = characters;
    }

    private int getIdGroup() {
        return idGroup;
    }

    private void setIdGroup(int idGroup) {
        this.idGroup = idGroup;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Character> getCharacters() {
        return characters;
    }

    public void setCharacters(ArrayList<Character> characters) {
        this.characters = characters;
    }
}
