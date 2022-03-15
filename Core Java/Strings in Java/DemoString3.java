package maccess;
import java.util.*;
public class DemoString3 {
	public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      System.out.println("Enter the String1:");
      String s1 = s.nextLine().trim();
      System.out.println("Enter the String2:");
      String s2 = s.nextLine().trim();
      System.out.println("====equals()====");
      boolean k = s1.equalsIgnoreCase(s2);
      if(k) {
    	 System.out.println("Strings are equal..."); 
      }else {
    	  System.out.println("Strings are Not-Equal...");
      }
      System.out.println("===compareTo()====");
      int z = s1.compareToIgnoreCase(s2);
      if(z==0) {
    	  System.out.println("Strings are equal...");
      }else {
    	  System.out.println("Strings are Not-Equal..."); 
      }
      s.close();
	}
}

//o/p:
//Enter the String1:
//java
//Enter the String2:
//java     
//====equals()====
//Strings are equal...
//===compareTo()====
//Strings are equal...
