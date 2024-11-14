  

package tree;
class Tree{
    
     TNode root;
     Tree(String val, int N_child ){
         root = new TNode(val,N_child);
         System.out.println("Tree created with node "+val);
     }

    public static void main(String[] args) {
        Tree A = new Tree("A",2);
        TNode B = new TNode("B",3);
        TNode C = new TNode("C",2);
        TNode D = new TNode("D",0);
        TNode E = new TNode("E",0);
        TNode F = new TNode("F",0);
        TNode G = new TNode("G",0);
        TNode H = new TNode("H",0);
        
        A.root.Addchild(B);
        A.root.Addchild(C);
        
         B.Addchild(D);
         B.Addchild(E);
         B.Addchild(F);
         
         C.Addchild(G);
         C.Addchild(H);
         
         A.root.LavelOrderTraversal();
         int  NodeCount = A.root.NodeAndEdgeCount();
         System.out.println("");
         System.out.println("Number of Nodes are "+NodeCount); 
         System.out.println("Number of Edges are "+ --NodeCount);
    }
}
 
