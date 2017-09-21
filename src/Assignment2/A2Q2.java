/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author tejab6669
 */
public class A2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        //create a city
        City kitchener = new City();
        
        //create a robot
        Robot karel = new Robot(kitchener, 4, 1, Direction.EAST);
        
        //create walls
        new Wall(kitchener, 4, 1, Direction.SOUTH);
        new Wall(kitchener, 4, 2, Direction.SOUTH);
        new Wall(kitchener, 4, 3, Direction.SOUTH);
        new Wall(kitchener, 4, 4, Direction.SOUTH);
        new Wall(kitchener, 4, 5, Direction.SOUTH);
        new Wall(kitchener, 4, 6, Direction.SOUTH);
        new Wall(kitchener, 4, 7, Direction.SOUTH);
        new Wall(kitchener, 4, 8, Direction.SOUTH);
        new Wall(kitchener, 4, 9, Direction.SOUTH);
        new Wall(kitchener, 4, 1, Direction.EAST);
        new Wall(kitchener, 4, 2, Direction.EAST);
        new Wall(kitchener, 4, 8, Direction.EAST);
        new Wall(kitchener, 4, 6, Direction.EAST);
        
        //create a thing
        new Thing(kitchener, 4, 9);
        
        //have karel og over hurdles
        while(!karel.canPickThing()== true){
        
            
        if(!karel.frontIsClear()){
    karel.turnLeft();
    karel.move();
    karel.turnLeft();
    karel.turnLeft();    
    karel.turnLeft();   
    karel.move();
    karel.turnLeft();
    karel.turnLeft();
    karel.turnLeft();
    karel.move();
    karel.turnLeft(); 
    
        }else{
            karel.move();
        }
    
        
        
        
        
        
        }
        
        
    }
       
        }


    



