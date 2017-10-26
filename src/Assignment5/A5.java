/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment5;

import java.util.Scanner;

/**
 *
 * @author tejab6669
 */
public class A5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // create a scanner
        Scanner input = new Scanner(System.in);
        
        //ask for a word to translate
        System.out.println("Please enter a word.");
        String word = input.nextLine();
        
        for(int i= 0; i < word.length(); i++){
        
            
          if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i)=='i' || word.charAt(i)=='u' || word.charAt(i)=='o'){
            
            String partOne = word.substring(0, i);
            String partTwo = word.substring(i);
            
            word = partOne + "ub" + partTwo;
            
           i = i+3;
          }
                }
            System.out.println(word);
        
                
        }
    }
    
