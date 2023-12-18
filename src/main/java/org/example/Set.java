package org.example;

import java.util.ArrayList;
import java.util.List;

public class Set {

    int setNumber;
    private Player player;
    List<Roll> rolls;

    int totalSetPoints;

    public Set(int setNumber, Player player){
        this.setNumber = setNumber;
        this.player = player;
        rolls = new ArrayList<>();
    }

    public Player getPlayer(){
        return this.player;
    }
    public int getTotalSetPoints(){
        return this.totalSetPoints;
    }

    public void bowling(){
        Roll roll1 = new Roll(this.player);
        int val1 = roll1.Bowl(10);
        rolls.add(roll1);
        if(val1==10){
            System.out.println("Player: " + player.getName() + " Scored Strike");
            this.totalSetPoints += (val1+10);
        }
        else{
            Roll roll2 = new Roll(this.player);
            int val2 = roll2.Bowl(10-val1);
            rolls.add(roll2);
            if((val1 + val2) == 10){
                System.out.println("Player: " + player.getName() + " Scored Spare");
                this.totalSetPoints += (val1+5);
            }
            else{
                System.out.println("Player: " + player.getName() + " Scored " + (val1+val2));
                this.totalSetPoints += (val1+val2);
            }
            }
        }
}
