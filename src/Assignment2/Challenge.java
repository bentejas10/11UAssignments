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
public class Challenge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a city
        City kitchener = new City();
        
        //create 2 robots
        Robot karel = new Robot(kitchener, 1, 1, Direction.NORTH);
        Robot tina = new Robot(kitchener, 1, 1, Direction.NORTH);
        
        karel.move(); 
        tina.move();
        
        
    }
}
