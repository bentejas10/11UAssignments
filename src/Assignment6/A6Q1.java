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
public class A6Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);

        //ask how many students are in class
        System.out.println("How many students are in class?");
        //spot for user to input
        int students = input.nextInt();
        //create a doble array to hold all of the variables
        double[] average = new double[students];
        // create the starting value for overall average
        double oAverage = 0;
        //output asking the user for class marks
        System.out.println("Enter the marks:");
        //create a for loop to go through all of the students avergages
        for (int i = 0; i < average.length; i++) {
            //calculate the class average
            average[i] = input2.nextDouble();
            oAverage = oAverage + average[i];



        }
        //make output round to 2 decimal places
        double total2 = oAverage / students;
        double total3 = total2 * 100;
        double total4 = Math.round(total3) / 100.00;
//output the class average
        System.out.println("The class average is " + total4 + "%.");
    }
}
