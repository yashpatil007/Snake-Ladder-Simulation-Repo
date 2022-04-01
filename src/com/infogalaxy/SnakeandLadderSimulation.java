package com.infogalaxy;

import java.util.Random;

public class SnakeandLadderSimulation {
    int position = 0;
    int dies;
    public void showposition() {
        System.out.println("Your Position is="+position);
    }
    public void rollsDies(){
        Random random = new Random();
        int dies = random.nextInt()%7;
        if(dies < 0) {
            dies = -(dies);
        } else  if (dies == 0){
            dies = 1;
        }
        System.out.println("Rolls the Dies="+dies);
        }
        public static void main(String args[]) {
        SnakeandLadderSimulation sls = new SnakeandLadderSimulation();
        sls.showposition();
        sls.rollsDies();
        }
}
