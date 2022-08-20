import java.util.*;

public class Main {
  
    public static boolean plaindrome(String str){
            int i =0 , j = str.length()-1;
            while(i < j){
                if(str.charAt(i) != str.charAt(j)){
                    return false;
                }
                i++;
                j--;
            }
            
        return true;
    }
  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    	System.out.println("Enter the string");
    	String inp = input.next();
    	
    	boolean ans = plaindrome(inp);
    	System.out.println(ans);
    	
  }
}