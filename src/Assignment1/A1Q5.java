/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
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
 * @author Ben
 */
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a new city named kitchener
        City kitchener = new City();
        
        //create 2 new robots
        Robot karel = new Robot(kitchener, 3, 3, Direction.EAST);
        Robot maria = new Robot(kitchener, 0, 1, Direction.WEST);
        
        //place a label for karel and maria
        karel.setLabel("K");
        maria.setLabel("M");
        
        //create things
        new Thing(kitchener, 0, 0);
        new Thing(kitchener, 1, 0);
        new Thing(kitchener, 1, 1);
        new Thing(kitchener, 1, 2);
        new Thing(kitchener, 2, 2);
        
        //create walls
        new Wall(kitchener, 2, 3, Direction.NORTH);
        new Wall(kitchener, 2, 3, Direction.WEST);
        new Wall(kitchener, 2, 3, Direction.EAST);
        new Wall(kitchener, 3, 3, Direction.EAST);
        new Wall(kitchener, 3, 3, Direction.SOUTH);
        
        //have karel turn
        karel.turnLeft();
        karel.turnLeft();
        
        //make karel move
        karel.move();
        
        //make maria move
        maria.move();
        
        //make maria pick up thing
        maria.pickThing();
        
        //have karel turn
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        
        //make karel move
        karel.move();
        
        //make karel pick up thing
        karel.pickThing();
        
        //have maria turn
        maria.turnLeft();
        
        //make maria move
        maria.move();
        
        //make maria pick up thing
        maria.pickThing();
        
        //make karel move
        karel.move();
        
        //make karel pick up thing
        karel.pickThing();
        
        //have karel turn
        karel.turnLeft();
        
        //have maria turn
        maria.turnLeft();
        
        //make maria move
        maria.move();
        
        maria.pickThing();
        
        
        
        
        
        
        
                }
    
    
}
