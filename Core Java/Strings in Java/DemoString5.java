package maccess;
import java.util.*;
public class DemoString5 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String");
         String str = s.nextLine();
         int len = str.length();
         System.out.println("===Display using for loop===");
         for(int i=0;i<=len-1;i++)
         {
        	 char ch = str.charAt(i);
        	 System.out.print(ch);
         }//end of loop
         System.out.println("\n====Display in reverse===");
         for(int i=len-1;i>=0;i--)
         {
        	char ch = str.charAt(i);
        	System.out.print(ch);
         }//end of loop
         s.close();
	}
}

//o/p:
//Enter the String
//program
//===Display using for loop===
//program
//====Display in reverse===
//margorp
