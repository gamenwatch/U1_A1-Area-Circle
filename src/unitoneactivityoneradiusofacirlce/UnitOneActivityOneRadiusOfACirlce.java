/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package unitoneactivityoneradiusofacirlce;

/**
 *Jacob Lacey
 *19 Sept 2018
 *To calculate the radius of a  circle
 */
public class UnitOneActivityOneRadiusOfACirlce {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //double is a variable that stores numbers
        double radius = 15.0;//cm
        double pi = 3.14;
        double area = 0.0;//cm2
        
        //algorithm for the calc of the radius of a circle
        area = pi * radius * radius;
        
        //printing the answer plus the units
        System.out.println("the area... "+area+" cm squared.");
    }
    
}
