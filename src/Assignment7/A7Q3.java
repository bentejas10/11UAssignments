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
public class A7Q3 {

    public void factors(int integer) {

        System.out.println("The numbers that are divisible into " + integer + " are: ");
        for (int i = 1; i < integer; i++) {
            int remainder = integer % i;
            if(remainder == 0){
                System.out.println(i);
            }
        }
        System.out.println(integer);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create an object for method
        A7Q3 test = new A7Q3();

        // create a scanner
        Scanner input = new Scanner(System.in);

        //ask for the number
        System.out.println("Which number would you like to  use?");
        int integer = input.nextInt();

        // output
        test.factors(integer);
    }
}
