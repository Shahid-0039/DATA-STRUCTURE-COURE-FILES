
package tree; 

 class TNode{
    String data;
    TNode[] children;
    int Ch_count;
    TNode  left=null;
    TNode  right=null;
    int NodeCount = 1;
    TNode(String val,int N_Child){
    this.data=val;
    this.children=new TNode[N_Child];
    this.Ch_count = 0;
    }
    
    public void Addchild(TNode child){
    if(Ch_count < children.length){
      children[Ch_count++] = child;
      System.out.println("Child Added ");
    }
    else{
        System.out.println("Node is Full");    
    }
    }
    
   public int NodeAndEdgeCount() {
         
        for (TNode child : children) {
            if (child != null) {
                NodeCount += child.NodeAndEdgeCount(); 
            }
        }
        return NodeCount;
    }
    
     public void LavelOrderTraversal(){
         System.out.print(" "+this.data);
         for(int i =0; i<children.length;i++){
            if (children[i] != null) { 
                children[i].LavelOrderTraversal(); 
        }
         }
   } 
     
 }