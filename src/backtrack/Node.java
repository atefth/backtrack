/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package backtrack;

/**
 *
 * @author atef
 */
public class Node {
    
    private int value;
    private Node parent;
    private Node left;
    private Node right;
    
    public Node (int val, Node p, Node l, Node r){
        
        value = val;
        parent = p;
        left = l;
        right = r;
        
    }
    
    public Node (int val){
        
        value = val;
        parent = null;
        left = null;
        right = null;
        
    }
    
    //insert Node n at the next available child Node
    public boolean append(Node n){
        
        if (this.setLeftNode(n)){
            n.setParentNode(this);
            return true;
            
        }else if (this.setRightNode(n)){
            n.setParentNode(this);
            return true;
            
        }else{
            
            return false;
            
        }
        
    }
    
    //set Node l as this node's left Node
    public boolean setLeftNode(Node l){
        
        if (this.left == null){
            
            this.left = l;
            return true;
            
        }else{
            
            return false;
            
        }
        
    }
    
    //set Node r as this node's right Node
    public boolean setRightNode(Node r){
        
        if (this.right == null){
            
            this.right = r;
            return true;
            
        }else{
            
            return false;
            
        }
        
    }
    
    //set Node p as this node's parent node
    public void setParentNode(Node p){
        
        this.parent = p;
        
    }
    
    //set this node's value
    public void setValue(int val){
        
        this.value = val;
        
    }
    
    //get this node's value
    public int getValue(){
        
        return this.value;
        
    }
    
    //get this node's left node
    public Node left(){
        
        return this.left;
        
    }
    
    //get this node's right node
    public Node right(){
        
        return this.right();
        
    }
    
    //get this node's parent node
    public Node parent(){
        
        return this.parent();
        
    }

    //append Node n to this Node's children
//    public boolean appendToChildren(Node n) {
//        if (this.left.append(n))
//            return true;
//        else if (this.right.append(n))
//            return true;
//        else
//            return false;
//    }
    
}
