/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author tejab6669
 */
public class A1Q2 {
    private static Direction NORTH;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // make a new city named kitchener
        City kitchener = new City();
        
        //create a robot
        Robot karel = new Robot (kitchener, 1, 2, Direction.SOUTH);
        
        //create walls
        new Wall (kitchener, 1, 2, Direction.NORTH);
        new Wall (kitchener, 1, 1, Direction.NORTH);
        new Wall (kitchener, 1, 1, Direction.WEST);
        new Wall (kitchener, 2, 1, Direction.WEST);
        new Wall (kitchener, 2, 1, Direction.SOUTH);
        new Wall (kitchener, 1, 2, Direction.EAST);
        new Wall (kitchener, 1, 2, Direction.SOUTH);
        
        //create a thing
        new Thing (kitchener, 2, 2);
        
        //have karel turn
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        
        //make karel move
        karel.move();
        
        //have karel turn
        karel.turnLeft();
        
        //make karel move
        karel.move();
        
        //have karel turn
        karel.turnLeft();
        
        //make karel move
        karel.move();
        
        //have karel pick up thing
        karel.pickThing();
        
        //have karel turn
        karel.turnLeft();
        karel.turnLeft();
        
        //make karel move
        karel.move();
        
        //have karel turn
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        
        //make karel move
        karel.move();
        
        //have karel turn
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        
        //make karel move
        karel.move();
        
        //have karel turn
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        
        
        
        
    }
}
