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
public class A4Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner inputName = new Scanner(System.in);
        Scanner inputFirstOutOf = new Scanner(System.in);
        Scanner inputFirstScore = new Scanner(System.in);
        Scanner inputSecondOutOf = new Scanner(System.in);
        Scanner inputSecondScore = new Scanner(System.in);
        Scanner inputThirdOutOf = new Scanner(System.in);
        Scanner inputThirdScore = new Scanner(System.in);
        Scanner inputFourthOutOf = new Scanner(System.in);
        Scanner inputFourthScore = new Scanner(System.in);
        Scanner inputFifthOutOf = new Scanner(System.in);
        Scanner inputFifthScore = new Scanner(System.in);
        
        System.out.println("Please enter your name:");
        String outputName = inputName.nextLine();
        
        System.out.println("What was the first test out of?:");
        double outputFirstOutOf = inputFirstOutOf.nextInt();
        
        System.out.println("What mark did you get?:");
        double outputFirstScore = inputFirstScore.nextInt();
        
        System.out.println("What was the second test out of?:");
        double outputSecondOutOf = inputSecondOutOf.nextInt();
        
        System.out.println("What mark did you get?:");
        double outputSecondScore = inputSecondScore.nextInt();
        
        System.out.println("What was the first test out of?:");
        double outputThirdOutOf = inputThirdOutOf.nextInt();
        
        System.out.println("What mark did you get?:");
        double outputThirdScore = inputThirdScore.nextInt();
        
        System.out.println("What was the fourth test out of?:");
        double outputFourthOutOf = inputThirdOutOf.nextInt();
        
        System.out.println("What mark did you get?:");
        double outputFourthScore = inputFourthScore.nextInt();
        
        System.out.println("What was the fifth test out of?:");
        double outputFifthOutOf = inputFifthOutOf.nextInt();
        
        System.out.println("What mark did you get?:");
        double outputFifthScore = inputFifthScore.nextInt();
        
        System.out.println("Test scores for Doug:");
        
        double test1Final = outputFirstScore / outputFirstOutOf *100;
        
        System.out.println("Test 1: " + test1Final + "%");
        
        double test2Final = outputSecondScore / outputSecondOutOf *100;
        
        System.out.println("Test 2: " + test2Final + "%");
        
        double test3Final = outputThirdScore / outputThirdOutOf *100;
        
        System.out.println("Test 3: " + test3Final + "%");
        
        double test4Final = outputFourthScore / outputFourthOutOf *100;
        
        System.out.println("Test 4: " + test4Final + "%");
        
        double test5Final = outputFifthScore / outputFifthOutOf *100;
        
        System.out.println("Test 5: " + test5Final + "%");
        
        double testsAdded = test1Final + test2Final + test3Final + test4Final + test5Final;
        
        double totalAverage = testsAdded / 5;
        
        System.out.println("Average: " + totalAverage + "%");
    }
}
