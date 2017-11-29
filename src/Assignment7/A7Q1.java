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
public class A7Q1 {

     public double areaOfCirc(double radius){
    // calculate area
        double answer = Math.pow(radius, 2) * Math.PI;
        
        // send back the answer
        return answer;
     }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create an object to run my methods
        A7Q1 test = new A7Q1();
        
        // create a scannner
        Scanner radiusI = new Scanner(System.in);
        
        // ask what the radius is
        System.out.println("What is the radius of your circle?");
        double radius = radiusI.nextInt(); 
        
        
        
        // calculate area
        double area = test.areaOfCirc(radius);
        
        //tell the area
        System.out.println("The area of your circle is " + area);
    }
}
