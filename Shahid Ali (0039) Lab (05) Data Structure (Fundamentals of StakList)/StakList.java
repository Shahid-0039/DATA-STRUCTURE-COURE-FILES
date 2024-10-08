/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package staklist;
public class StakList {

    class Node{
    int Data;
    Node next;
    
    Node(int data){
    this.Data=data;
    this.next=null;
    }
    }
    private Node top;
    private int size = 0;
    StakList(){
        this.top = null;
    }
    
    public void push(int data){
    Node newNode= new Node(data);
    newNode.next = top;
    top=newNode;
    ++size;
    }
    public int pop(){
    if(top==null){
      return -1;
    }
    int value = top.Data;
    top = top.next; 
     --size;
     return value;
    }
    
    public int peek(){
   return top.Data; 
    }
    
    public boolean isEmty(){
      return top==null;
    } 
    
    public int size(){
           return size;
    }
      public void display(){
        if(top==null){
        System.out.println("No data found");
      }
       Node temp = top;
      while(temp!=null){
          System.out.print (temp.Data+" -> ");
          temp = temp.next;
      }
          System.out.println(" ");
      }
    public static void main(String[] args) {
         
      StakList stack=new StakList(); 
     
      stack.push(6);
      stack.push(5);
      stack.push(4);
      stack.push(3);
      stack.push(2);
      stack.push(1);
      stack.display();
      System.out.println(stack.pop());
      System.out.println(stack.peek());
      System.out.println(stack.isEmty());
      System.out.println(stack.size());
    }
    
}
