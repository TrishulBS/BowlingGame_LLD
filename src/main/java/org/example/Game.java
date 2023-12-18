package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Game {
    int gameNumber;
    List<Player> players;
    List<Set> sets;

    public Game(int gameNumber, List<Player> players){
        this.players = players;
        this.gameNumber = gameNumber;
        sets = new ArrayList<>();
    }

    public int getCurrentScoreByPlayer(Player player){
        int score = 0;
        for(Set set: sets){
            Player pl = set.getPlayer();
            if(pl == player){
                score += set.getTotalSetPoints();
            }
        }
        return score;
    }

    public Player getWinner(){
        Map<Player, Integer> map = new HashMap<>();
        for(Set set: sets){
            Player player = set.getPlayer();
            map.put(player, map.getOrDefault(player, 0) + set.getTotalSetPoints());
        }
        int maxPoints = Integer.MIN_VALUE;
        Player winner = null;
        for(Player player: players){
            int value = map.get(player);
            if(value>maxPoints) {
                maxPoints = value;
                winner = player;
            }
        }
        return winner;
    }

    public void bowlBegin(int setNumber, Player player){
        Set set = new Set(setNumber, player);
        set.bowling();
        this.sets.add(set);
    }
}
