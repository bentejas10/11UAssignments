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
public class A7Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create an object to run methods
        A7Q7 test = new A7Q7();

        // create a scanner
        Scanner input = new Scanner(System.in);

        // ask for number
        System.out.println("Please enter your number: ");
        int number = input.nextInt();
        int remainder = 0;
        while(number >= 10){
            remainder = number / 10;
            
        }
        
        System.out.println(remainder);
    }
}
