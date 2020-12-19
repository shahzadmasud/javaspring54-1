/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2_ternary;

/**
 *
 * @author b
 */
public class Assignment2_Ternary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("7.5 ^ 5 = " + power(7.5, 5));
        
 
    }
    static double power(double x, long y) {
//        if (y > 1) {
//            return x * power(x, y - 1);
//        } else if (y < 0) {
//            return 1 / power(x, -y);
//        } else {
//            return y == 0 ? 1 : x;
//        }
        
        // Shift it to Ternary operator
        return y > 1 ? x * power(x, y - 1)
                : y < 0 ? 1 / power(x, -y)
                : y == 0  ? 1 : x;
    }
}
