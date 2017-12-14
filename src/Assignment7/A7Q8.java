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
public class A7Q8 {

    public void allDigitsOdd(int number) {
    
    // create variable to change the valu ewithout changing inital number
        int forNum = number;

        // create a variable to keep track of the number lengths
        int tracker = 1;

        // tracker to count how many digits the number is
        while (forNum >= 10) {
            forNum = forNum / 10;
            tracker = tracker + 1;
        }

        // create variable for last digit in number
        int lastDig = number % 10;
        int evenOrOdd = lastDig % 2;

        // int to see if number is odd if the inputted number is 1 digit long
        int check = number % 2;

        // ouput true if first number is odd and skip the rest of the code
        if (check != 0 && tracker == 1) {
            System.out.println("True");

            // to see if last number is even, print false and skip rest of code yet
        } else if (evenOrOdd == 0) {
            System.out.println("False");

            // next scenario if previous haven't been true
        } else {

            // create int to hold number value
            int FLNumber = number;

            // for loop to go through each numerical value and see if it is even or odd
            for (int i = 0; i < tracker; i++) {

                // to go through each digit in number
                FLNumber = FLNumber / 10;
                int last = FLNumber % 10;

                // see if current digit is even or odd
                int EO = last % 2;

                // digit is even then print false and cancel for loop
                if (EO == 0) {
                    System.out.println("False");
                    break;
                }
                // if number was not even, print out true since number must me even 
                System.out.println("True");
                break;
            }

        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create an object to run method
        A7Q8 test = new A7Q8();

        // create a scanner
        Scanner input = new Scanner(System.in);

        // ask user for number
        System.out.println("Please enter a number: ");
        int number = input.nextInt();

        // bring back procedure done in method allDigitsOdd
        test.allDigitsOdd(number);

    }
}
