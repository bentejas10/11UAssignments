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
        
        //create an array for how many students are in class
        System.out.println("How many students are in class?");
        int students = input.nextInt();
        
        double[] average = new double[students];
        double oAverage = 0;
        System.out.println("Enter the marks:");
        for(int i = 0; i < average.length;i++){
            
            average[i] = input2.nextDouble();
            oAverage = oAverage + average[i];
            
            
            
        }
        double total2 = oAverage / students;
        double total3 = total2 * 100;
        double total4 = Math.round(total3) / 100.00;

        System.out.println("The class average is " + total4 + "%.");
    }
}
