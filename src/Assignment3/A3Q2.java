/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/**
 *
 * @author tejab6669
 */
public class A3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a city
        City benland = new City();

        //create a robot
        Robot ben = new Robot(benland, 1, 1, Direction.EAST);

        //create label for things
        benland.showThingCounts(true);

        //create things
        new Thing(benland, 1, 1);
        new Thing(benland, 1, 1);
        new Thing(benland, 1, 1);
        new Thing(benland, 1, 1);
        new Thing(benland, 1, 1);
        new Thing(benland, 1, 1);
        new Thing(benland, 1, 1);
        new Thing(benland, 1, 1);
        new Thing(benland, 1, 1);
        new Thing(benland, 1, 1);


        //have ben transfer things
        for (int count = 0; count < 10; count = count + 1) {
            ben.pickThing();
            ben.move();
            ben.putThing();
            ben.turnLeft();
            ben.turnLeft();
            ben.move();
            ben.turnLeft();
            ben.turnLeft();


        }

        ben.move();
    }
}