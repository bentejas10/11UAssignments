/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment6;

import java.util.Scanner;

/**
 *
 * @author tejab6669
 */
public class A6Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create scanners
        Scanner inputN = new Scanner(System.in);
        Scanner inputH = new Scanner(System.in);

        // ask how many people to add
        System.out.println("How many people do you wish to add?");
        int people = inputN.nextInt();
        //create array to hold people's heights
        int[] average = new int[people];
        // set starting value for initial average
        int oAverage = 0;
        // ask for heights
        System.out.println("What are their heights in cm?");
        // create loop to go through the array collecting averages
        for (int i = 0; i < average.length; i++) {
            average[i] = inputH.nextInt();
            //add all the heights into one variable
            oAverage = oAverage + average[i];

        }
        // divide added heights by number of people
        int total2 = oAverage / people; //this is the average
        // print the average heights
        System.out.println("The average height is " + total2 + "cm.");
        System.out.println("The above average heights are: ");

        // create for loop to go through everyones height
        for (int e = 0; e < average.length; e++) {
            //see if each individual height is more than average
            if (average[e] > total2) {
                // print all heights that are above average    
                System.out.println(average[e]);
            }


        }


    }
}
