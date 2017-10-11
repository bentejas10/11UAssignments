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
public class A3Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a city
        City benland = new City();

        //create a robot
        Robot ben = new Robot(benland, 3, 3, Direction.SOUTH);

        //create four squares with walls
        new Wall(benland, 1, 1, Direction.NORTH);
        new Wall(benland, 1, 1, Direction.WEST);

        new Wall(benland, 1, 2, Direction.NORTH);
        new Wall(benland, 2, 1, Direction.WEST);

        new Wall(benland, 2, 1, Direction.SOUTH);
        new Wall(benland, 2, 2, Direction.SOUTH);

        new Wall(benland, 1, 2, Direction.EAST);
        new Wall(benland, 2, 2, Direction.EAST);

        new Wall(benland, 1, 4, Direction.NORTH);
        new Wall(benland, 1, 4, Direction.WEST);

        new Wall(benland, 1, 5, Direction.NORTH);
        new Wall(benland, 2, 4, Direction.WEST);

        new Wall(benland, 2, 4, Direction.SOUTH);
        new Wall(benland, 2, 5, Direction.SOUTH);

        new Wall(benland, 1, 5, Direction.EAST);
        new Wall(benland, 2, 5, Direction.EAST);

        new Wall(benland, 4, 1, Direction.NORTH);
        new Wall(benland, 4, 1, Direction.WEST);

        new Wall(benland, 4, 2, Direction.NORTH);
        new Wall(benland, 5, 1, Direction.WEST);

        new Wall(benland, 5, 1, Direction.SOUTH);
        new Wall(benland, 5, 2, Direction.SOUTH);

        new Wall(benland, 5, 2, Direction.EAST);
        new Wall(benland, 4, 2, Direction.EAST);

        new Wall(benland, 4, 4, Direction.NORTH);
        new Wall(benland, 4, 4, Direction.WEST);

        new Wall(benland, 4, 5, Direction.NORTH);
        new Wall(benland, 5, 4, Direction.WEST);

        new Wall(benland, 5, 4, Direction.SOUTH);
        new Wall(benland, 5, 5, Direction.SOUTH);

        new Wall(benland, 5, 5, Direction.EAST);
        new Wall(benland, 4, 5, Direction.EAST);
        
        for(int moveCount = 0; moveCount < 16; moveCount = moveCount + 1){
            //make ben go around the square
            ben.move();
            ben.move();
            ben.move();
            
            //make ben go past the origin and start on the next square
            if(ben.getAvenue() == 3 && ben.getStreet() == 3){
            }else{
                ben.turnLeft();
            }
            
            
            
    }
}
}