/*
 * Angus Henry
 * 08/05/2018
 * Squares2.java
 * This program prints all the numbers squared
 */

package squares2;
import java.util.*;
/**
 *
 * @author anhen3335
 */
public class Squares2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    ArrayList <Integer> squares = new ArrayList();
    Collections.addAll(squares, 0, 1, 4, 9, 16, 25, 36, 49, 64, 81);
    System.out.println ("Squares \n ******************************  \n");
    for (int i = 0;i < squares.size(); i++ ){
        System.out.println ("Numbers:"  + i);
        System.out.println ("Squared:" + squares.get(i));
    }
    }
}