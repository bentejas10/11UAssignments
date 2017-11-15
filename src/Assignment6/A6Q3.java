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
public class A6Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner
        Scanner input = new Scanner(System.in);
        
        // create an array to hold the two integers
        int digits[] = new int[1];
        
        //go through array to collect integers
        for (int i = 0; i < digits.length; i++) {
            digits[i] = input.nextInt();
            
        }
    }
}
