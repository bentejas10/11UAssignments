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
public class A4Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //ask the user to input their name
        System.out.println("Please enter your name.");
        
        //create a scanner for input
        Scanner input = new Scanner (System.in);
        
        //get input from user
        String Name = input.nextLine();
        
        //output to the user
        System.out.println("Hello " + Name + ". How are you today?");
        
        
    }
}
