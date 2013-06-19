/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package backtrack;

import java.util.Random;

/**
 *
 * @author atef
 */
public class BinaryTree {
    
    private static int height;
    private final int range = 100;
    public Random r;
    private Node root;
    
    public BinaryTree(int h){
        
        BinaryTree.height = h;
        r = new Random();
        
    }
    
    public int makeValue(){
        
        int value = r.nextInt(range);
        System.out.println("A random value of " + value + " is being put inside a node.");
        return value;
        
    }
    
    public void generateTree(){
        
        System.out.println("Generating Tree...");
        root = new Node(makeValue());
        Node currentNode = root;
        
        for (int i = 0; i < height; i++){
            
            for (int j = 0; j < 2; j++){
                if (!currentNode.append(new Node(makeValue())))
                    currentNode = currentNode.left();
            }
            
        }
        System.out.println("Left aligned tree generated.");
        
    }
    
    public Node getRoot(){
        
        return this.root;
        
    }
    
}
