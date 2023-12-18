package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> tracks = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));

        System.out.println("Welcome to Bowling Arcade");
        Player player1 = new Player("Trishul");
        Player player2 = new Player("Virat");

        int track = tracks.remove(0);
        Game game1 = new Game(track, Arrays.asList(player1, player2));
        player1.addGame(game1);
        player2.addGame(game1);
        System.out.println("Game started between "+ player1.getName() + " and " + player2.getName());
        for(int i = 0; i<10; i++){
            System.out.println("Player1 begins set" + (i+1));
            game1.bowlBegin(i+1, player1);

            System.out.println("Player2 begins set" + (i+1));
            game1.bowlBegin(i+1, player2);

            System.out.println(player1.getName() + "'s score after set" + (i+1) +":" + game1.getCurrentScoreByPlayer(player1));
            System.out.println(player2.getName() + "'s score after set" + (i+1) +":" + game1.getCurrentScoreByPlayer(player2));
        }

        System.out.println("Winner is: " + game1.getWinner().getName());


    }
}