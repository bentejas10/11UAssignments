/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/**
 *
 * @author tejab6669
 */
public class A2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a city
        City kitchener = new City();

        //create a robot
        Robot karel = new Robot(kitchener, 30, 41, Direction.SOUTH);

        //have karel always return to the origin 0,0
        while (karel.getAvenue() != 0) {
            if (karel.getDirection() != Direction.WEST) {
                karel.turnLeft();
            } else {
                karel.move();
            }
        }

        
        while(karel.getDirection() != Direction.NORTH){
            karel.turnLeft();
        
    }
        while (karel.getStreet() != 0){
            karel.move();
        }
}
}
