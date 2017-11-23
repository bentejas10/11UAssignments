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
public class A6Q6 {

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
        
        
        
        
        // create an array with x slots
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
        
        int numberMOne = number - 1;
        
        int bAverage = 0;
        
        for(int y = 0; y < grades.length; y++){
        bAverage = bAverage + grades[y];
          
        }
        double average2 = bAverage / number;  
        
        System.out.println("The lowest mark in the class is: " + grades[0]);
        
        System.out.println("The highest mark in the class is: " + grades[0 + numberMOne]);
        
        
        System.out.println("The class average is: " + average2);
        
        
        
         }
        
    }
    
