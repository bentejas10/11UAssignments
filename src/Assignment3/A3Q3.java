/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/**
 *
 * @author tejab6669
 */
public class A3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a city
        City benland = new City();
        
        //create a robot
        Robot ben = new Robot(benland, 1, 1, Direction.EAST, 20);
        
        //have ben drop things in a rectangle
         for(int moveCount = 0; moveCount < 4; moveCount = moveCount + 1){
             
         
         for(int count = 0; count < 5; count = count + 1){
             ben.putThing();
             ben.move();
    }
         ben.turnLeft();
         ben.turnLeft();
         ben.turnLeft();
         ben.move();
         ben.turnLeft();
         ben.turnLeft();
         ben.turnLeft();
         ben.move();
         }
}
}
