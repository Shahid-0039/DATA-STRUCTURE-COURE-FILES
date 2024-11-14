
package binarytree;
public class Node {
 int data;
 Node left;
 Node right;
 
 Node(int data){
 this.data=data;
 this.left=null;
 this.right=null;
 } 
 
 public void addRightChild( Node root, Node child){
    root.right = child; 
     System.out.println("Added at Right");
 }
 
 public void addLeftChild(Node root, Node child){
    root.left = child;  
    System.out.println("Added at left");
    }
}

