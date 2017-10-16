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
public class A4Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create scanners
        Scanner inputSpeedLimit = new Scanner(System.in);
        Scanner inputSpeed = new Scanner(System.in);

        //ask user for speed limit
        System.out.println("Enter the speed limit:");
        int outputSpeedLimit = inputSpeedLimit.nextInt();

        System.out.println("Enter the recorded speed of the car:");
        int outputSpeed = inputSpeed.nextInt();

        if (outputSpeed <= outputSpeedLimit) {
            System.out.println("Congradulations, you are within the speed limit!");


        }
        if (outputSpeed > outputSpeedLimit && outputSpeed <= outputSpeedLimit + 20) {
            System.out.println("You are speeding, your fine is $100.");

        }
        if (outputSpeed >= outputSpeedLimit + 20 && outputSpeed <= outputSpeedLimit + 30) {
            System.out.println("You are speeding and your fine is $270.");

        }
        if (outputSpeed >= outputSpeedLimit + 30) {
            System.out.println("You are speeding and your fine is $500");
        }
    }
}
