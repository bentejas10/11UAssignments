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
public class A4Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // ask the user for input
        System.out.println("Please enter the measurement in inches you wish to convert:");
        
        //create a scanner for input
        Scanner input = new Scanner(System.in);
        
        //get the input from the user
        double Inches = input.nextDouble();
        
        //error checking
        while(Inches < 0){
            System.out.println("Please enter a positive number.");
            
            Inches = input.nextDouble();
        }
        //calculate the centimeters
        double centiMeters = Inches * 2.54;
        
        //tell the user the output of the conversion
        System.out.println(Inches + " is " + centiMeters + " in centimeters.");
    }
}
