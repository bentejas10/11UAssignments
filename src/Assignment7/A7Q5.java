/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment7;

import java.util.Scanner;

/**
 *
 * @author tejab6669
 */
public class A7Q5 {

    public void chaotic(int nOfLines) {
        // to apply number of lines wanted
        for (int i = 0; i < nOfLines; i++) {
            // to generate a random number
            int randNum = (int) (Math.random() * (5 - 1 + 1)) + 1;
            // to create asterisks equal to the random number generated
            for (int u = 0; u < randNum; u++) {
                // print the asterisks
                System.out.print("*");
            }
            // go to the next line
            System.out.println(" ");
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create object to run methods
        A7Q5 test = new A7Q5();

        // create a scannner
        Scanner input = new Scanner(System.in);

        // ask the user for a number
        System.out.println("Please enter a number: ");

        // for the user to input number
        int nOfLines = input.nextInt();

        // output
        test.chaotic(nOfLines);
    }
}
