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
        
        return r.nextInt(range);
        
    }
    
    public void generateTree(){
        
        root = new Node(makeValue());
        Node currentNode = root;
        
        for (int i = 0; i < height; i++){
            
            if (!currentNode.append(new Node(makeValue())))
                currentNode = currentNode.left();
            
        }
        
    }
    
    public Node getRoot(){
        
        return this.root;
        
    }
    
}
