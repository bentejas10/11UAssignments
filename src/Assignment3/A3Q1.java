/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/**
 *
 * @author tejab6669
 */
public class A3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a city
        City kitchener = new City();

        //create a robot
        Robot ben = new Robot(kitchener, 0, 2, Direction.WEST);

        //create walls
        new Wall(kitchener, 1, 1, Direction.NORTH);
        new Wall(kitchener, 1, 1, Direction.WEST);
        new Wall(kitchener, 1, 2, Direction.NORTH);
        new Wall(kitchener, 1, 2, Direction.EAST);
        new Wall(kitchener, 2, 1, Direction.WEST);
        new Wall(kitchener, 2, 1, Direction.SOUTH);
        new Wall(kitchener, 2, 2, Direction.EAST);
        new Wall(kitchener, 2, 2, Direction.SOUTH);


        //have karel go around the square
        for (int count = 0; count < 8; count = count + 1) {
            ben.move();
            ben.move();
            ben.turnLeft();
            ben.move();
        }
    }
}
