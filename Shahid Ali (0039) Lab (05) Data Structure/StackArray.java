
package stackarray;

public class StackArray {
private int maxSize;   
private int[] stackArray;
private int top;
int size=0;

StackArray(int size){
    this.maxSize=size;
    stackArray = new int[size];
    this.top=-1;
}

public void Push(int value){  
if(isFull()){
    System.out.println("Stack is full");
}
else{
    stackArray[++top]=value;
    System.out.println(value+" is Pushed in Stack");
    ++size;
}
}

public int Pop(){
    if(top<0){
        System.out.println("Stack is Under-flow");
    }
    int temp = stackArray[top--];
    --size;
    return temp;
}

public int peek(){
   int temp=stackArray[top];
   return temp;
}


public void Display(){
for(int i=top; i>=0;i--){
    System.out.print(stackArray[i]+" ");        }
}

public boolean isEmpty(){
return top == -1;
}

public boolean isFull(){
return top == maxSize;
}
public int size(){
   return size;
}
    public static void main(String[] args) {
        
StackArray Stack=new StackArray(4);

Stack.Push(3);
Stack.Push(2);
Stack.Push(1);

System.out.print("Elements in stack Are ");
Stack.Display();
System.out.println("");
Stack.peek();

System.out.println(Stack.Pop()+" is poped");

Stack.peek();

System.out.println(" Is stack empty :"+Stack.isEmpty());
System.out.println(" Is stack full :"+Stack.isFull());
System.out.println(+Stack.size());
    }
    
}
