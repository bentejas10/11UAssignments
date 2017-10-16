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
public class A4Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //craete scanner
        Scanner inputDice = new Scanner(System.in);

        //create piece


        int currentSquare = 1;

        //create loop
        while (currentSquare != 100) {
            System.out.println("Please enter sum of dice");
            int outputDice = inputDice.nextInt();

            if (currentSquare + outputDice > 100) {
                currentSquare = currentSquare;
                System.out.println("You have exceeded 100, please try again.");
                
            } else {

                currentSquare = currentSquare + outputDice;
                System.out.println("You are now on square " + currentSquare);

                if (currentSquare >= 100) {
                    System.out.println("You win!");
                    break;
                }
                if (currentSquare == 54) {
                    currentSquare = 19;
                    System.out.println("You are now on square " + currentSquare);
                }
                if (currentSquare == 90) {
                    currentSquare = 48;
                    System.out.println("You are now on square " + currentSquare);
                }
                if (currentSquare == 99) {
                    currentSquare = 77;
                    System.out.println("You are now on square " + currentSquare);

                }
                if (currentSquare == 9) {
                    currentSquare = 34;
                    System.out.println("You are now on square " + currentSquare);

                }
                if (currentSquare == 40) {
                    currentSquare = 64;
                    System.out.println("You are now on square " + currentSquare);
                }
                if (currentSquare == 67) {
                    currentSquare = 86;
                    System.out.println("You are now on square " + currentSquare);
                }

                if (outputDice == 0) {
                    break;
                }
            }
        }

    }
}
