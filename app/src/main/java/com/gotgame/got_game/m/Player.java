package com.gotgame.got_game.m;

/**
 * Created by sento on 20/10/2016.
 */

public class Player {

    private int idPlayer;
    private String nickname;

    public Player(int idPlayer, String nickname) {
        this.idPlayer = idPlayer;
        this.nickname = nickname;
    }

    private int getIdPlayer() {
        return idPlayer;
    }

    private void setIdPlayer(int idPlayer) {
        this.idPlayer = idPlayer;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return this.nickname;
    }
}
