/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment4;

import java.util.Scanner;

/**
 *
 * @author tejab6669
 */
public class A4Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //tell the user to input
        System.out.println("Please enter 4 numbers on separate lines.");
        
        //create 4 Scanners for input
        Scanner inputOne = new Scanner(System.in);
        Scanner inputTwo = new Scanner(System.in);
        Scanner inputThree = new Scanner(System.in);
        Scanner inputFour = new Scanner(System.in);
        
        //have the user input numbers
        double outputOne = inputOne.nextInt();
        double outputTwo = inputTwo.nextInt();
        double outputThree = inputThree.nextInt();
        double outputFour = inputFour.nextInt();
        
        //tell the user the numbers
        System.out.println("Your numbers were:" + outputOne + ", " + outputTwo + ", " + outputThree + ", and " + outputFour);
        
        
    }
}
