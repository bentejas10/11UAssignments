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
        
        if (outputSpeed <= outputSpeedLimit){
            System.out.println("Congradulations, you are within the speed limit!");
            
        }
       
        }
        
    }

