
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
public class A0Q9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String words[] = new String[10];
        int counter = 0;
        System.out.println("Please enter 10 words.");
        for(int i = 0; i < words.length; i++){
            counter++;
            System.out.println("Word " + counter + ":");
            words[i] = input.nextLine();
        }
        int lengths[] = new int[words.length];
        
        for(int i = 0; i < words.length; i++){
            lengths[i] = words[i].length();
        }
        int total = 0;
        for(int i = 0; i < lengths.length; i++){
            total = total + lengths[i];
        }
        double average = total / lengths.length;
        System.out.println("The average word length is " + average + " letters.");
    }
    
}
