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
public class A7Q6 {

    public int lastDigit(int number) {
        
        if (number < 0) {

            // create an integer where the negative inputted number is positive
            int posNum = number * -1;

            // find last digit for new positive number
            int remainder = posNum % 10;

            // return last digit
            return remainder;

            //if number is not negative
        } else {

            // find last digit for inputted number
            int remainder = number % 10;

            // return last digit of inputted number
            return remainder;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create object to run method
        A7Q6 test = new A7Q6();

        // create a scanner
        Scanner input = new Scanner(System.in);
while(true){
        // tell user to input a number
        System.out.println("Please enter a number: ");
        int number = input.nextInt();

        // create variable to hold last digit
        int LFinal = test.lastDigit(number);

        // output last digit
        System.out.println("The last digit of your number is: " + LFinal);

    }
}
}
