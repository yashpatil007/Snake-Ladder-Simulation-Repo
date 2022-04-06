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
        public void showPosition () {
        System.out.println("Your Position is : " + position);
    }
        //Rolling Die to get Fixed position
        public void rollsDies () {
            //UC-4- Checking for Player Wining at 100th Position
            while(position != 100) {
                Random random = new Random();
                int dieNo = (int) ((Math.random() * (7 - 1)) + 1);
                System.out.println("Dies No : " + dieNo);

                //UC-3 Checking for Option to Play
                int option = (int) ((Math.random() * (4 - 1)) + 1);
                System.out.println("OPTION NO : " + option);
                switch (option) {
                    case NO_PLAY :
                        System.out.println("NO PLAY Arrived. Stay on Same Position");
                        break;
                    case LADDER :
                        System.out.println("HURRAY !!! You got Ladder");
                        position = position + dieNo;
                        break;
                    case SNAKE :
                        if (position < 0) {
                            position = -(position);
                        }
                        System.out.println("OPPS !!! you got Snake");
                        position = position - dieNo;
                        System.out.println("Position :" + position);
                        break;
                    }
                    showPosition();
                }
            }
        public static void main(String[] args) {
            // For Create Object of SnakeLadderSimulation class
            SnakeandLadderSimulation sls = new SnakeandLadderSimulation();
            //Showing Player Position
            sls.showPosition();
            //For Rolling Die
            sls.rollsDies();
            sls.showPosition();

        }
}

