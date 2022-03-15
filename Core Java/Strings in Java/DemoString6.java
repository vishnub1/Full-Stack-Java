package maccess;
import java.util.*;
public class DemoString6 {
	public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
         System.out.println("Enter the String:");
         String str = s.nextLine();
         int len = str.length();
         int count=0;
         for(int i=0;i<=len-1;i++)
         {
        	 char ch = str.charAt(i);
        	 switch(ch)
        	 {
        	 case 'a':
        	 case 'A':count++;
        		 break;
        	 case 'e':
        	 case 'E':count++;
        		 break;
        	 case 'i':
        	 case 'I':count++;
        		 break;
        	 case 'o':
        	 case 'O':count++;
        		 break;
        	 case 'u':
        	 case 'U':count++;
        		 break;
        	 }//end of switch
         }//end of loop
         System.out.println("Number of Vowels:"+count);
         s.close();
	}
}
