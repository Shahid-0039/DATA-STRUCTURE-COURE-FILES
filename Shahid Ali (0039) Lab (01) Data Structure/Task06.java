
package task.pkg06;
import java.util.Scanner;
public class Task06 {
    
    public static boolean Palindrome(String Str){
        int left=0;
        int right=Str.length()-1;
        while(left<right){
        if(Str.charAt(left)!=Str.charAt(right)){
        return false;
        }
        left++;
        right--;
        }
        return true;
        }
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
        System.out.print("Enter any String: ");
        String Word = scan.nextLine(); 
        if(Palindrome(Word)){
            System.out.println("String is Palindrome");
       }
        else{
            System.out.println("String is not palindrome");
        }}}
