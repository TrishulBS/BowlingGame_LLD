package org.example;

import java.util.ArrayList;
import java.util.List;

public class Player {

    List<Game> games;
    private String name;

    public Player(String name){
        games = new ArrayList<>();
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void addGame(Game game){
        games.add(game);
    }
}
