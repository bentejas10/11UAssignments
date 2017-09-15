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
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a new city called kitchener
        City kitchener = new City();
        
        //create new thing
        new Thing(kitchener, 3, 1);
        
        //create new robot named karel
        Robot karel = new Robot(kitchener, 3, 0, Direction.EAST);
        
        //create new walls
        new Wall(kitchener, 1, 3, Direction.NORTH);
        new Wall(kitchener, 1, 3, Direction.WEST);
        new Wall(kitchener, 1, 3, Direction.EAST);
        new Wall(kitchener, 2, 3, Direction.WEST);
        new Wall(kitchener, 3, 2, Direction.NORTH);
        new Wall(kitchener, 3, 2, Direction.WEST);
        new Wall(kitchener, 2, 4, Direction.NORTH);
        new Wall(kitchener, 2, 4, Direction.EAST);
        new Wall(kitchener, 3, 4, Direction.EAST);
        
        //make karel move
        karel.move();
        
        //have karel pick up thing
        karel.pickThing();
        
        //have karel turn
        karel.turnLeft();
        
        //make karel move
        karel.move();
        
        //have karel turn
        karel.turnLeft();
        karel.turnLeft();
        
        
        
        
        
        
        
        
                
    }
}
