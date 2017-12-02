/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment6;

import java.util.Scanner;

/**
 *
 * @author Ben
 */
public class A6Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // say original statement for aesthetics 
        System.out.println("The prime numbers under 1000 are: ");

        // create boolean array to mark all numbers
        boolean pNumbers[] = new boolean[1000];
        pNumbers[0] = false;
        
        // set all spots in boolean array to true
        for (int i = 0; i < 1000; i++) {
            pNumbers[i] = true;
        }

        // go through numbers between 2 and 1000 to see if they are prime starting with 2 as the divisor
        for (int x = 2; x <= 1000; x++) {

            // proceed when if statement is correct
            if (pNumbers[x - 1] == true) {

                // output the position before x
                System.out.println(x);

                // go to the multiple of the current position of x in second for loop and make it false
                for (int y = 2 * x; y <= 1000; y = y + x) {
                    pNumbers[y - 1] = false;
                }
            }

        }
    }
}
