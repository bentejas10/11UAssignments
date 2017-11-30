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
public class A7Q2 {

     public void examGrade(int grade){
    if(grade >= 80){
        System.out.println("Your grade is an B");
    }else if(grade >= 70 && grade < 80){
        System.out.println("Your grade is a B");
    }else if(grade >= 60 && grade < 70){
        System.out.println("Your grade is a C");
    }else if(grade >= 50 && grade <60){
        System.out.println("Your grade is a D");
    }else if(grade < 50 && grade >= 0){
        System.out.println("Your grade is an F");
    }
     }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create an object for method
        A7Q2 test = new A7Q2();
        
        // create a scanner
        Scanner input = new Scanner(System.in);
        
        //ask for the grade
        System.out.println("What is your grade?");
        int grade = input.nextInt();
        
        //output
        test.examGrade(grade);
    }
}
