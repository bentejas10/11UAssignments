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
public class A6Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner
        Scanner input = new Scanner(System.in);

        // create an array with 10 slots
        int grades[] = new int[10];
        System.out.println("What are the students grades");

        //go through array to collect grades
        for (int i = 0; i < grades.length; i++) {
            grades[i] = input.nextInt();

        }
        for (int u = 0; u < grades.length; u++) {


            for (int e = 0; e < grades.length; e++) {
                if (e != 9 && grades[e] > grades[e + 1]) {
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
    }
}
