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
public class A6Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   // create a scanner
        Scanner input = new Scanner(System.in);
        Scanner inputN = new Scanner(System.in);

        // ask for how many grades
        System.out.println("How many grades would you like to sort?");
        int number = inputN.nextInt();
        
        //create variable to hold last number
        int last = number - 1;
        
        // math to find the middle
         int half = number / 2;
         int halfMOne = half - 1;
        
        
        // create an array with 10 slots
        int grades[] = new int[number];
        System.out.println("What are the students grades");

        //go through array to collect grades
        for (int i = 0; i < grades.length; i++) {
            grades[i] = input.nextInt();

        }
        for (int u = 0; u < grades.length; u++) {


            for (int e = 0; e < grades.length; e++) {
                if (e != last && grades[e] > grades[e + 1]) {
                    int tool = grades[e];

                    grades[e] = grades[e + 1];

                    grades[e + 1] = tool;
                }
            }
        }
        System.out.println("The grades in order are: ");

        for (int o = 0; o < grades.length; o++) {
            System.out.println(grades[o]);
            
            
        }
        
        int remainder = number % 2;
        
        if(remainder == 0){
            int totalMedian = grades[0 + half] + grades[0 + halfMOne] / 2;
            System.out.println(halfMOne);
            System.out.println("The median is " + totalMedian);
        }else{
            
            
            int median = grades[0 + halfMOne];
            System.out.println("The median is " + median);
            System.out.println(halfMOne);
        }
        
        
    }
}

    
    

