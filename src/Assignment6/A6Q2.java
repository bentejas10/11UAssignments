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
        Scanner inputN = new Scanner(System.in);
        Scanner inputH = new Scanner(System.in);
        
        System.out.println("How many people do you wish to add?");
         int people = inputN.nextInt();
         int[] average = new int[people];
         int oAverage = 0;
         System.out.println("What are their heights in cm?");
         
         for (int i = 0; i < average.length; i++) {
            average[i] = inputH.nextInt();
            oAverage = oAverage + average[i];


        }
         int total2 = oAverage / people; //this is the average
        System.out.println("The class average height is " + total2 + "cm.");
         
        for(int e = 0; )
    }
}
