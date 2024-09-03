
package task.pkg05;
import java.util.Scanner;
public class Task05 {
    public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.print("Enter the size of array: ");
    int size = scan.nextInt();
    
    System.out.println("Enter the elements of array.");
    int Array[]= new int[size];
    for(int i=0;i<size; i++ ){
    Array[i]= scan.nextInt(); 
  
    }
    System.out.println(""); 
    for(int i=Array.length-1;i>=0; i-- ){
        System.out.print(Array[i]+" "); 
    }   
    }
    
}
