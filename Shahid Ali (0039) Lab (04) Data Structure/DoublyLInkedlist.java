
package doublylinkedlist;
public class DoublyLInkedlist {
class Node{
int data;
Node next, prev;

Node(int data){
this.data=data;
this.next=null;
this.prev=null;
}}
private Node head;
private Node tail;

DoublyLInkedlist(){
this.head= null;
this.tail= null;
}

public void insertAtstart(int data) {
    
        Node new_node = new Node(data);
        if(head == null){
        head=tail=new_node;
        }
        else  {
            new_node.next = head;
            head.prev = new_node;
            head=new_node;
        }

}

public void insertAtend(int data) {
    
        Node new_node = new Node(data);
        if(head == null){
        head=tail=new_node;
        }
        
        else  {
            new_node.prev = tail;
            tail.next= new_node;
            tail=new_node;
        }}

public void insertAtPosition(int data, int position) {
    Node newNode = new Node(data);
    if (position == 1) {
        newNode.next = head;
        if (head != null) {
            head.prev = newNode;
        }
        head = newNode;
    }
    Node current = head;
    for (int i = 1; i < position - 1 && current != null; i++) {
        current = current.next;
    }

    if (current == null) {
        System.out.println("Position out of bounds");
    }

    newNode.next = current.next;
    newNode.prev = current;

    if (current.next != null) {
        current.next.prev = newNode;
    }

    current.next = newNode;
}

public void DeleteAtstart(){
if(head==null){
    System.out.println("List is empty");
}
    if(head==tail){
    head=null;
    tail=null;
        
        System.out.println("Single element is deleted");
    }
   if(head!=tail){
   head=head.next;
   head.prev=null;
       
   System.out.println("Node is deleted..");
}
}

public void DeleteAtend(){
if(tail==null){
    System.out.println("List is empty");
}
    if(head==tail){
    head=null;
    tail=null;

        System.out.println("Last element is deleted");
    }
   if(head!=tail){
   tail=tail.prev;
   tail.next=null;
       
   System.out.println("Node is deleted..");
}}

public void DeleteAtPosition(int Position){
Node current=head;
int count=1;
while(current != null && count != Position){
current=current.next;
count++;
}
current.prev.next=current.next;
current.next.prev=current.prev;
    System.out.println(Position+" Position's element is deleted");
}

public void printList() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
          System.out.println();
    }

public void printRevres() {
        Node curr = tail;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.prev;
        }
          System.out.println();
    }

public void Search(int search){
    int position=1;
    boolean found=false;
    Node curr = head;
    while(curr!=null){
   if(curr.data == search){
       found = true;
        break;
   }
    position++;
   curr = curr.next;
    }
   if(found==true){
       System.out.println(curr.data+" value is found at position : "+position); 
   }
  else{
      System.out.println("value is not found");
  
  
   }
}

public void CountNode(){
    int count=0;
 Node curr = head;
    while(curr!=null){
   curr = curr.next;
   count++;
    }
    System.out.println("There are "+count+" nodes are in List");
}
 

    public static void main(String[] args) {
        DoublyLInkedlist newNode = new DoublyLInkedlist();
        
        newNode.insertAtstart(2);
        newNode.insertAtend(3);
        newNode.insertAtstart(1);
        newNode.insertAtend(4);
        newNode.printList();
        
        newNode.insertAtPosition(5, 5);
        newNode.insertAtPosition(6, 6);
        newNode.printList();
        
        System.out.println("In forward direction");
        newNode.printList();
        
        System.out.println("In Backward direction");
        newNode.printRevres();
        
        newNode.DeleteAtPosition(2);
        newNode.printList();
        
        newNode.DeleteAtstart();
        newNode.printList();
        
        newNode.DeleteAtend();
        newNode.printList();

        newNode.Search(4);
        
        newNode.CountNode();
    }
    
}
