/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment6;

import java.util.Scanner;

/**
 *
 * @author Ben
 */
public class A6Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // create a scanner
        Scanner input = new Scanner(System.in);
        
        // create an array
        int numbers[] = new int[1000];
        
        // create a boolean array
        boolean[] pNumbers = new boolean[1000];
        
        // create starting variable for assigning numbers
        int value = 0;
        
        //for loop for array
        for(int i = 0; i < numbers.length; i++){
            value = value + 1;
            numbers[i] = value;
            
        }
            for(int e = 0; e < pNumbers.length; e++){
                pNumbers[e] = true;
                
                
            }
        for(int y = 0; y < pNumbers.length; y++){
                
           
        }
        
    }
}

        
    
    

