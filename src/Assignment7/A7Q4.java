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
public class A7Q4 {
public double compoundInterest(double inValue, double gRate, int nOfYear){
     
    // create the (1 + r) part of the formula
    double inBracket = gRate + 1;
     
     double bracketE = Math.pow(inBracket, nOfYear);
     
     double finalAnswer = bracketE * inValue;
 
     
     return finalAnswer;
}
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create an object for the method
        A7Q4 test = new A7Q4();
        
        // create a scanner
        Scanner input = new Scanner(System.in);
        
        // ask for inital value
        System.out.println("What is your inital value?");
        double inValue = input.nextInt();
        
        // ask for growth rate
        System.out.println("What is your rate of growth?");
        double gRate = input.nextInt() / 100;
        
        // ask for number of years
        
        System.out.println("How many years will the interest be active?");
        int nOfYears = input.nextInt();
       
        double finalAnswer = test.compoundInterest(inValue, gRate, nOfYears);
        
        
        // output answer
     System.out.println("You will have " + finalAnswer + " dollars after " + nOfYears + " years.");
    }
}
