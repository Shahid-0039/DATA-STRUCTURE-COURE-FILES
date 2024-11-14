
package binarytree;

import java.util.LinkedList;
import java.util.Queue;


public class BinaryTree {
    private Node root;

    public BinaryTree(int data) {
        this.root =new Node(data);
    }
  
 public void addRightChild( Node root, Node child){
    root.right = child; 
    System.out.println("Added at Right");
 }
 
 public void addLeftChild(Node root, Node child){
    root.left = child;  
    System.out.println("Added at left");
    }
 
    public int countNodes() {
        return countNodesRecursive(root);
    }

    private int countNodesRecursive(Node node) {
        if (node == null) {
        return 0;
        } 
        return 1 + countNodesRecursive(node.left) + countNodesRecursive(node.right);
    }
public boolean preOrderSearch(Node root, int key) {
        if (root == null)
            return false;
        
        if (root.data == key) {          
            return true;
        }
        
        if (preOrderSearch(root.left, key))
            return true;
        
        return preOrderSearch(root.right, key);
    }
    
    public void levelOrderTraversal() {
        if (root == null) return;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        System.out.print("Level-order Traversal: ");
        while (!queue.isEmpty()) {
            Node node = queue.remove();
            System.out.print(node.data + " ");
            if (node.left != null) queue.add(node.left);
            if (node.right != null) queue.add(node.right);
        }
        System.out.println();
    }

  
    public void preOrderTraversal(Node root) {
        if (root == null) return;
        System.out.print(" "+root.data);
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
        
    }

    
    public void inOrderTraversal(Node root) {
        if (root == null) return;
        inOrderTraversal(root.left);
        System.out.print(" "+root.data);
        inOrderTraversal(root.right);
    }

    public void postOrderTraversal(Node root) {
        if (root == null) return;
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(" "+root.data);
    }

   
    public static void main(String[] args) {
        BinaryTree  A = new BinaryTree(6);//ROOT
        Node B =new Node(5);
        Node C =new Node(4);
        Node D =new Node(3);
        Node E =new Node(2);
        Node F =new Node(1);
        Node G =new Node(0);
        
        A.addLeftChild(A.root, B);
        A.addRightChild(A.root, C);
        A.addLeftChild(B, D);
        A.addRightChild(B, E);
        A.addLeftChild(C, F);
        A.addRightChild(C, G);
        
        System.out.println("Lavel order Traversal");
        A.levelOrderTraversal();
        System.out.println("");
        
        System.out.println("Preorder Traversal");
        A.preOrderTraversal(A.root);
        System.out.println("");
        
        System.out.println("Inorder Traversal");
        A.inOrderTraversal(A.root);
        System.out.println("");
        
        System.out.println("Postorder Traversal");
        A.postOrderTraversal(A.root);
        System.out.println("");
        int NodeCount=A.countNodes();
        System.out.println("Nodes are "+NodeCount);
        System.out.println("Edges are "+ --NodeCount);
        
        int key=8;
        if (A.preOrderSearch(A.root, key)) {
            System.out.println("Key " + key + " found.");
        } else {
            System.out.println("Key " + key + " not found.");
        }
        
    }
}
