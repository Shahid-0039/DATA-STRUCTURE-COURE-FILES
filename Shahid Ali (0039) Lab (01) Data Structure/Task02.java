
package task02;
public class Task02 {
public static void main(String[] args) {
    System.out.println("  Elements before insertion ");
      int Arr[] = new int[6];
    Arr[0]=12; Arr[1]=24; Arr[2]=36; Arr[3]=48; Arr[4]=60;
     for(int i = 0;i<Arr.length;i++ ){
     System.out.print(Arr[i]+" ");} 
     System.out.println();
      int a=6;
     for(int i =Arr.length-1; i>0; i-- ){
         Arr[i]=Arr[i-1];}
         Arr[0]=a;
     System.out.println("  Elements after insertion");
      for(int i =0;i<Arr.length;i++ ){
     System.out.println("Element at index "+i+" "+ Arr[i]);}
     System.out.println();
     System.out.println();
     System.out.println(" Elements before insertion ");
      int arr[] = new int[6];
     arr[0]=100; arr[1]=200; arr[2]=300; arr[3]=400; arr[4]=500;
     for(int i = 0;i<arr.length;i++ ){
     System.out.print(arr[i]+" ");} 
     System.out.println();
      int b= 250;
      int p = 2;
     for(int i =arr.length-1; i > p; i-- ){
         arr[i]=arr[i-1];}
         arr[p]=b;
     System.out.println(" Elements after insertion in middle ");
      for(int i =0;i<arr.length;i++ ){
     System.out.println("Element at index "+i+" "+ arr[i]);}
      System.out.println();
      System.out.println();
       System.out.println(" Elements before insertion ");
      int arr1[] = new int[6];
     arr1[0]=10; arr1[1]=20; arr1[2]=30; arr1[3]=40; arr1[4]=50;
     for(int i = 0;i<arr1.length;i++ ){
     System.out.print(arr1[i]+" ");} 
     System.out.println();
      int c= 60;
       arr1[arr1.length-1]= c;
     System.out.println(" Elements after insertion at the end ");
      for(int i =0;i<arr1.length;i++ ){
     System.out.println("Element at index "+i+" "+ arr1[i]);
    }}}
