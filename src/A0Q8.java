
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author bente
 */
public class A0Q8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // ask user for initial amount
        System.out.println("Please enter the initial amount you are investing.");

        // initialize scanner
        Scanner input = new Scanner(System.in);
        // store initial into double
        double principle = input.nextDouble();

        // tel user to input their rate of growth and store in double
        System.out.println("Please enter the rate of growth for your investment in decimal notation.");
        System.out.println("For example: 0.04 is 4%");
        double growth = input.nextDouble();

        // create integers and doubles to hold values for investment
        int yearCountMillion = 0;
        double doubled = principle * 2;
        int yearCountDoubled = 0;
        double doubleTest = principle;
        double millionTest = principle;

        // add to year counter until investment is doubled
        while (doubleTest < doubled) {
            doubleTest = doubleTest * (1 + growth);
            yearCountDoubled++;
        }

        // add to other year count until investment reaches a million
        while (millionTest < 1000000) {
            millionTest = millionTest * (1 + growth);
            yearCountMillion++;
        }

        // output to the user how long it will take for investment to double and reach one million
        System.out.println("It will take " + yearCountDoubled + " years for your money to double.");
        System.out.println("It will take " + yearCountMillion + " years for your money to reach 1 million.");
    }

}
