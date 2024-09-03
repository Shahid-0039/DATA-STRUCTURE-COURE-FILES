package task.pkg04;
import java.util.Arrays;
public class Task04 {
    public static void main(String[] args) {
    int Arr[] = new int[5];
Arr[0]=13; Arr[1]=26; Arr[2]=39; Arr[3]=52; Arr[4]=65;
     int Index=4;int Element=Arr[Index];
     System.out.println("Elemennt at index "+Index+ " is "+Arr[Index] );    
     System.out.println("");
     int Arr1[] = new int[5]; Arr1[0]=4; Arr1[1]=6; Arr1[2]=2; Arr1[3]=8; Arr1[4]=10;
     int number=8;  boolean found=false; 
     for(int i = 0; i<=Arr1.length; i++){
     if(number == Arr1[i]){
         System.out.println(Arr1[i]+ " is at index "+ i);   
         found=true;  break; }} 
    if(found==false) {
         System.out.println( number + " is not Found in Array ");  }
     System.out.println("");
     int Arr2[] = new int[5];
     Arr2[0]=11; Arr2[1]=22; Arr2[2]=33; Arr2[3]=44; Arr2[4]=55;
     Arrays.sort(Arr);int left=0;
     int right=Arr2.length-1; int middle;
     boolean found1=false; int target = 33;
     while(left<=right){ middle=(right-left)/2;
     if(target==Arr2[middle]){
         System.out.println("Element "+target+" found at index "+ middle);
         found=true; break;}
     else if(target>Arr2[middle]){ left=middle+1; }
     else { right=middle-1;}
      if(found1==false) {System.out.println( target + " is not Found in Array ");  
         }}}}
