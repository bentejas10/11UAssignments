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
public class A4Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //create scanners
        Scanner inputFood = new Scanner(System.in);
        Scanner inputDj = new Scanner(System.in);
        Scanner inputHall = new Scanner(System.in);
        Scanner inputDecor = new Scanner(System.in);
        Scanner inputStaff = new Scanner(System.in);
        Scanner inputMisc = new Scanner(System.in);
        
        System.out.println("How much does the food for prom cost?");
        int outputFood = inputFood.nextInt();
        
        
        System.out.println("How much does the DJ cost?");
       int outputDj = inputDj.nextInt();
       
        System.out.println("How much does it cost to rent the hall?");
       int outputHall = inputHall.nextInt();
       
        System.out.println("How much does decorations cost?");
        int outputDecor = inputDecor.nextInt();
        
        System.out.println("How much does it cost for staff?");
        int outputStaff = inputStaff.nextInt();
        
        System.out.println("How much for miscellaneous costs?");
        int outputMisc = inputMisc.nextInt();
        
        //add up the total cost
        int total = outputFood + outputDj + outputHall + outputDecor + outputStaff + outputMisc;
        
        //find number of tickets needed
        int tickets = (int)Math.ceil(total/35.0);
        
        System.out.println("Your total cost is $" + total + ". You will need to sell " + tickets + " tickets to break even.");
        
        
        
        
        
        
        
        
    }
}
