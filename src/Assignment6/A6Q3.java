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
        int digits[] = new int[2];
        System.out.println("What are the two digits?");
        
        //go through array to collect integers
        for (int i = 0; i < digits.length; i++) {
            digits[i] = input.nextInt();
            
            
        }
        // create a variable to hold digits[0]
        int tool = 0;
        
        //onyl use this if digits
        if(digits[0] > digits[1]){
        
        tool = digits[0];
        
        digits[0] = digits[1];
        
        digits[1] = tool;
        
        
        
        
            
            
            
        }
         
        
        System.out.println("The two digits are: " + digits[0] + ", " + digits[1]);
    }
}
