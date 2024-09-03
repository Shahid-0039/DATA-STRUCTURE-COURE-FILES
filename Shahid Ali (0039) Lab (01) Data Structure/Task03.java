/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task03;

public class Task03 {

    public static void main(String[] args) {
     System.out.println("Elements before DELETING ");
    int Arr[] = new int[5];
     Arr[0]=8;
     Arr[1]=16;
     Arr[2]=24;
     Arr[3]=32;
     Arr[4]=40;
       
     for(int i = 0;i <Arr.length-1; i++ ){
     System.out.print(Arr[i]+" ");
     } 
     System.out.println();
     System.out.println();
      int a=2;
     for(int i = a; i < Arr.length-1;  i++ ){
         Arr[i]=Arr[i+1];
         }
         Arr[Arr.length-1]=0;
     System.out.println("Elements after deleting");
      for(int i =0;i<Arr.length;i++ ){

     System.out.println("Element at index "+i+" "+ Arr[i]);
    } 
    }    
}
