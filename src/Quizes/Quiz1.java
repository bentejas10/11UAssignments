/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Quizes;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author tejab6669
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a city
        City kitchener = new City();

        //create a robot
        Robot karel = new Robot(kitchener, 1, 1, Direction.EAST);

        //create walls
        new Wall(kitchener, 1, 1, Direction.WEST);
        new Wall(kitchener, 1, 3, Direction.NORTH);
        new Wall(kitchener, 1, 3, Direction.SOUTH);
        new Wall(kitchener, 1, 4, Direction.NORTH);
        new Wall(kitchener, 1, 4, Direction.SOUTH);
        new Wall(kitchener, 1, 5, Direction.NORTH);
        new Wall(kitchener, 1, 5, Direction.SOUTH);
        new Wall(kitchener, 1, 6, Direction.NORTH);
        new Wall(kitchener, 1, 6, Direction.SOUTH);
        new Wall(kitchener, 1, 7, Direction.NORTH);
        new Wall(kitchener, 1, 7, Direction.SOUTH);
        new Wall(kitchener, 1, 7, Direction.EAST);

        //create things
        new Thing(kitchener, 1, 3);
        new Thing(kitchener, 1, 4);
        new Thing(kitchener, 1, 5);
        new Thing(kitchener, 1, 6);
        new Thing(kitchener, 1, 7);

        //have karel pick up a thing and return

        while (true) {
            while (!karel.frontIsClear()) {
                karel.turnLeft();
                karel.turnLeft();
                karel.move();
            }
            while (karel.getAvenue() == 1) {
                karel.move();

            }
            while (karel.getAvenue() != 1 && karel.frontIsClear()) {
                karel.move();


                if (karel.canPickThing()) {
                    karel.pickThing();
                    karel.turnLeft();
                    karel.turnLeft();
                    while (!karel.canPickThing() && karel.countThingsInBackpack() > 0 && karel.getAvenue() != 1) {
                        karel.move();



                    }
                    if (karel.getAvenue() == 1) {
                        karel.putThing();
                        karel.turnLeft();
                        karel.turnLeft();

                    }
                }
            }
        }
    }
}
