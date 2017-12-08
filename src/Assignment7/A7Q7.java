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

    public int firstDigit(int number) {
        // if statement to convert negative number to positive
        if (number < 0) {

            // create an integer where the negative inputted number is positive
            int posNum = number * -1;

            // while loop to divide number down until it gets to one digit
            while (number > 10) {
                number = number / 10;
            }

            // return final outcome
            return number;

        } else {

            // while loop to divide number down until it gets to one digit
            while (number > 10) {
                number = number / 10;

            }
            
            // return final output
            return number;
        }
    }

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

        // create integer to hold the first digit
        int firstDig = test.firstDigit(number);

        // tell user the first digit
        System.out.println("The first digit of the number " + number + " is " + firstDig);
    }
}
