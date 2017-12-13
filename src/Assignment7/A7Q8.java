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
       
        // create variable to change the valu ewithout changing inital number
        int forNum = number;
        
        // create a variable to keep track of the number lengths
        int tracker = 1;
        
        while(forNum >= 10){
            forNum = forNum / 10;
            tracker = tracker + 1;
        }
        
        // create variable for last digit in number
        int lastDig = number % 10;
        int evenOrOdd = lastDig % 2;
        // for loop to go through each numerical value and see if it is even or odd
        if(evenOrOdd == 0){
            System.out.println("False");
        }else{
            
            // create int to hold number value
            int FLNumber = number;
            
        for(int i = 0; i < tracker; i++){
            
            FLNumber = FLNumber / 10;
            int last = FLNumber % 10;
            int EO = last % 2;
            if(EO == 0){
                System.out.println("False");
                break;
            }
            System.out.println("True");
            break;
            }
            
        }
        
        
        }
        
        
    }
        


