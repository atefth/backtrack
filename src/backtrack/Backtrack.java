/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package backtrack;

/**
 *
 * @author atef
 */
public class Backtrack {

    private BinaryTree tree;
    public Node root;
    
    public Backtrack(){
        
        tree = new BinaryTree(4);
        tree.generateTree();
        root = tree.getRoot();
        
    }
    
    public boolean find(Node n, int value){
        
        if (n.isLeafNode()){
        
            if (check(n, value)){
                return true;
            }else{
                return false;
            }
        
        }else{
            
            if (n.left() != null)
                return find(n.left(), value);
            if (n.right() != null)
                return find(n.right(), value);
            else return false;
            
        }
        
    }

    private boolean check(Node currentNode, int val) {
        if (currentNode != null){
            if (currentNode.getValue() == val)
                return true;
            else
                return false;
        }else{
            return false;
        }
    }

}
