package org.example;

import java.util.Random;

public class Roll {
    private Player player;
    private int rollPoints;

    public Roll(Player player){
        this.player = player;
    }

    public int getRollPoints(){
        return this.rollPoints;
    }

    public Player getPlayer(){
        return this.player;
    }

    public int Bowl(int pins){
        Random random = new Random();
        int randomNumber = random.nextInt(pins*10)+1;

        if(pins == 10) {
            if(randomNumber<=30){
                this.rollPoints = 5;
                return 5;
            }
            else if(randomNumber<=50){
                this.rollPoints = 6;
                return 6;
            }
            else if(randomNumber<=75){
                this.rollPoints = 8;
                return 8;
            }
            else{
                this.rollPoints = 10;
                return 10;
            }
        }
        else{
            int rand = random.nextInt(pins)+1;
            this.rollPoints = rand;
            return rand;

        }

    }
}
