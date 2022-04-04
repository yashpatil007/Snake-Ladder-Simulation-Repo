package com.infogalaxy;

import java.util.Random;

public class SnakeandLadderSimulation {
    // Payer of the Position
    int position = 0;
    // Define Constants for Options
    final int NO_PLAY = 1;
    final int LADDER = 2;
    final int SNAKE = 3;

    // Showing the Player current Position
    public void showposition() {
        System.out.println("Your Position is : "+position);
    }
    //Rolling Die to get Fixed position
    public void rollsDies() {
        int dieNo = (int) ((Math.random()*6-1)+1);
        System.out.println("Dies No : "+dieNo);

        //UC-3 Checking for Option to Play
        int option = (int) ((Math.random()*3-1)+1);
        System.out.println("OPTION NO : "+option);
        switch (option) {
            case NO_PLAY :
                System.out.println("NO PLAY Arrived. Stay on Same Position");
                break ;
            case LADDER:
                System.out.println("HURRAY !!! You got Ladder");
                position = position + dieNo;
                break;
            case SNAKE:
                System.out.println("OPPS !!! you got Snake");
                position = position - dieNo;
                break;
        }
        }
        public static void main(String args[]) {
        // For Creat Object of SnakeLadderSimulation class
        SnakeandLadderSimulation sls = new SnakeandLadderSimulation();
        //Showing Player Position
        sls.showposition();
        //For Rolling Die
        sls.rollsDies();
        sls.showposition();
        }
}
