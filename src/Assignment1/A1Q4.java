/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/**
 *
 * @author Ben
 */
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create new city named kitchener
        City kitchener = new City();
        
        //create 2 new robots
        Robot karel = new Robot(kitchener, 0, 0, Direction.SOUTH);
        Robot billy = new Robot(kitchener, 0, 1, Direction.SOUTH);
        
        //create new walls
        new Wall(kitchener, 0, 1, Direction.WEST);
        new Wall(kitchener, 1, 1, Direction.WEST);
        new Wall(kitchener, 1, 1, Direction.SOUTH);
        
        //make billy move
        billy.move();
        
        //make karel move
        karel.move();
        
        //have billy turn
        billy.turnLeft();
        
        //make billy move
        billy.move();
        
        //make karel move
        karel.move();
        
        //have billy turn
        billy.turnLeft();
        billy.turnLeft();
        billy.turnLeft();
        
        //make billy move
        billy.move();
        
        //have karel turn
        karel.turnLeft();
        
        //make karel move
        karel.move();
        
        //have billy turn
        billy.turnLeft();
        billy.turnLeft();
        billy.turnLeft();
        
        //make billy move
        billy.move();
        
        
        
        
        
        
        
        
    }
    
}
