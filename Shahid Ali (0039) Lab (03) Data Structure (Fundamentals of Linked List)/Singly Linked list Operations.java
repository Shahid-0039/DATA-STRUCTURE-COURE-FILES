/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package list;
public class List {
   Node head;
   private int size;
  class Node{
      int data;
      Node next;
       Node(int data){
           this.data=data;
           this.next=null;
       }
  
  }
   public void addfirst(int data){
       Node newnode=new Node(data);
       if(head==null){
           head=newnode;
           return;
             
       }
      newnode.next=head;
      head=newnode;
      size++;
   }
   public void addlast(int data){
        Node newnode=new Node(data);
       if(head==null){
            head=newnode;
           return;
       }
        Node current=head;
       while(current.next!=null){
           current=current.next;
       }
      current.next=newnode;
      size++;
   }
   public void printall(){
       Node current=head;
       if(head==null){
           System.out.println("list is empty");
           return;
       }
           while(current!=null){
               System.out.print(current.data+"--->");
            current=current.next;
       }
   }
   public int getsize(){
       return size;
   }
   public void delfirst(){
         if(head==null){
       System.out.println("list is empty");
         }
  
         head=head.next;
         size--;
         
   }
   public void addposition(int data,int position){
       Node newNode=new Node(data);
       if(position==0){
        newNode.next=head;
         head=newNode;
       }
       else{
         Node currntNode=head;
         for(int i=0;i<size;i++){
        currntNode.next=currntNode.next;
   }
         newNode.next=currntNode.next;
         currntNode.next=newNode;
   }
       size++;
   }
  public void deltelast(){
     Node secoundlast=head;
     Node last=head.next;
     while(secoundlast.next.next!=null){
         secoundlast=secoundlast.next;
         last=last.next;
  }
     secoundlast.next=null;
  }
  public void delete_value(int data){
      Node newNode=new Node(data);
      if(head.data==data){
      head=head.next;
      size--;
      return;
      }
       Node current = head;
      if(current.next==null){
          System.out.println("this value ia not available");
          return;
      }
      current.next=current.next.next;
      size--;
  }
  public void search(int data){
      Node current=head;
      int position=0;
      while(current!=null){
      if(current.data==data){
          System.out.println("value is found"+position);
          return;
      }
      current=current.next;
      position++;
      }
      System.out.println("value is not found");    
  }
  public void reverse(){
      Node preNode=head;
      Node current=head.next;
      while(current!=null){
          Node nextNode=current.next;
          current.next=preNode;
         current=preNode;
         preNode=nextNode;
      }
  }
  public void cou_nodes(){
      int total=0;
        Node current=head;
        while(current!=null){
            total++;
            current=current.next;
        }
        System.out.println("total number of nodes : "+total);
  }
    public static void main(String[] args) {
      List l=new List();
        System.out.println("add first");
      l.addfirst(10);
      l.addfirst(20);
      System.out.println("add last");
      l.addlast(30);
      l.printall(); 
      System.out.println("add a postion");
      l.addposition(23, 2);
      l.printall();
      System.out.println("delete first");
      l.delfirst();
      l.printall();
      System.out.println("print a size"+l.getsize());
      System.out.print("delete last");
      l.deltelast();
      l.printall();
      System.out.println("delete by value");
      l.delete_value(20);
      l.printall();
      System.out.println("search");
      l.search(20);
      l.printall();
      System.out.println("reverse");
      l.reverse();
      l.printall();
      l.cou_nodes();
      l.printall();
         
    }
}
