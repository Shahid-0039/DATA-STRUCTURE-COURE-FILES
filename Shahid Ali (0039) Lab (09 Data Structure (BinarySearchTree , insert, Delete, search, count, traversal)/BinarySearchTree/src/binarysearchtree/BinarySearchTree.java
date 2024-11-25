
package binarysearchtree;

import java.util.LinkedList;
import java.util.Queue;

class Node {
 int data;
  Node left;
 Node right;

 Node(int value) {
   this.data = value;
  left = null;
 right = null;
    }
}

public class BinarySearchTree {
     Node root;
    BinarySearchTree(int data) {
        root = new Node(data);
    }

 public Node insertChild(Node root, int data) {
     if (root == null) {
   return new Node(data);}
 if (data < root.data) {
 root.left = insertChild(root.left, data);
 } else if (data > root.data) {
 root.right = insertChild(root.right, data);
 }
 return root;
    }

    public int countNodes(Node node) {
    if (node == null) {
     return 0;
     }
   return 1 + countNodes(node.left) + countNodes(node.right);
    }

    
 public boolean BSTsearch(Node root, int key) {
 if (root == null) {
return false; 
}
if (root.data == key) {
 return true;
 }
 if (key < root.data) {
 return BSTsearch(root.left, key);
 } else {
 return BSTsearch(root.right, key);
}}
 
public Node NodeDelete(Node root, int key) {
 if (root == null) {
 return null;
  }
 if ( key < root.data) {
  root.left = NodeDelete(root.left, key);
   } else if (key> root.data) {
    root.right = NodeDelete(root.right, key);
   } else {
  if (root.left == null) {
   return root.right;
   }
   if (root.right == null) {
     return root.left;
   }
    Node successor = InOrderSuccessor(root);
 root.data = successor.data;
   root.right = NodeDelete(root.right, successor.data);
  }
        return root;
    }
    public Node InOrderSuccessor(Node curr) {
        curr = curr.right;
    while (curr != null && curr.left != null) {
     curr = curr.left;
        }
      return curr;
    }
    
 public void levelOrderTraversal() {
if (root == null) return;
Queue<Node> queue = new LinkedList<>();
   queue.add(root);
System.out.print("Level-order Traversal: ");
 while (!queue.isEmpty()) {
  Node node = queue.poll();
System.out.print(node.data + " ");
if (node.left != null) queue.add(node.left);
  if (node.right != null) queue.add(node.right);
 }
   System.out.println();
    }

    public void preOrderTraversal(Node root) {
if (root == null) return;
System.out.print(" " + root.data);
preOrderTraversal(root.left);
 preOrderTraversal(root.right);
    }
   
 public void inOrderTraversal(Node root) {
 if (root == null) return;
  inOrderTraversal(root.left);
  System.out.print(" " + root.data);
   inOrderTraversal(root.right);
    }

 public void postOrderTraversal(Node root) {
    if (root == null) return;
   postOrderTraversal(root.left);
postOrderTraversal(root.right);
 System.out.print(" " + root.data);
    }

    public static void main(String[] args) {
 
 BinarySearchTree BSTtree = new BinarySearchTree(50);
  BSTtree.insertChild(BSTtree.root, 90);
 BSTtree.insertChild(BSTtree.root, 30);
BSTtree.insertChild(BSTtree.root, 20);
 BSTtree.insertChild(BSTtree.root, 40);
 BSTtree.insertChild(BSTtree.root, 70);
BSTtree.insertChild(BSTtree.root, 60);
BSTtree.insertChild(BSTtree.root, 80);

        
System.out.println("Preorder Traversal");
 BSTtree.preOrderTraversal(BSTtree.root);
 System.out.println();

 System.out.println("Inorder Traversal");
  BSTtree.inOrderTraversal(BSTtree.root);
 System.out.println();

  System.out.println("Postorder Traversal");
 BSTtree.postOrderTraversal(BSTtree.root);
  System.out.println();
  
 int nodeCount = BSTtree.countNodes(BSTtree.root);
System.out.println("Nodes are " + nodeCount);
System.out.println("Edges are " + (nodeCount - 1)); 
    
 int key = 80; 
 if (BSTtree.BSTsearch(BSTtree.root, key)) {
   System.out.println("Key " + key + " found.");
  } else {
   System.out.println("Key " + key + " not found.");      
 }
        BSTtree.levelOrderTraversal();
     int Key=60;
    System.out.println("Deleting "+Key);
        BSTtree.root = BSTtree.NodeDelete(BSTtree.root, Key);

        System.out.println("Inorder traversal after deletion:");
        BSTtree.inOrderTraversal(BSTtree.root);
        System.out.println();
    }
}
