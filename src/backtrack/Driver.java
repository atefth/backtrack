/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package backtrack;

import java.util.Scanner;

/**
 *
 * @author atef
 */
public class Driver {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Backtrack b = new Backtrack();
        Scanner k = new Scanner(System.in);
        
        while (true){
            System.out.print("Please enter the value you want to seearch for: ");
            int toFind = k.nextInt();
            if (b.find(b.root, toFind))
                System.out.println("The value, " + toFind + " was found in the tree!");
            else
                System.out.println("No such value was found!");
        
        }
        
    }
    
}
