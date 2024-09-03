
package task.pkg07;
import java.util.*;
public class Task07 {
public static boolean IsAnagram(String Str1,String Str2){
if(Str1.length()!=Str2.length()){
return false;
}
char[] Arr1=Str1.toLowerCase().toCharArray();
char[] Arr2=Str2.toLowerCase().toCharArray();
Arrays.sort(Arr1);
Arrays.sort(Arr2);
return Arrays.equals(Arr1,Arr2);
}
    public static void main(String[] args) {
       Scanner Scan=new Scanner(System.in);
       System.out.print("Enter the First String: ");
       String FirstStr=Scan.nextLine();
       System.out.print("Enter the Second String: ");
       String SecondStr=Scan.nextLine();
       if(IsAnagram(FirstStr,SecondStr)){
           System.out.println(FirstStr+" and "+SecondStr+" are Anagrams");
       }
       else{
       System.out.println(FirstStr+" and "+SecondStr+" are Not Anagrams");
       }}}
