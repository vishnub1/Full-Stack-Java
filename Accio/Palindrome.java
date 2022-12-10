import java.util.*;
import java.lang.*;
import java.io.*;

public class Palindrome
{
	public static void main (String[] args) throws java.lang.Exception{
		//your code here
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int originalNumber = num;
    int rev = 0;
    int dig;
    while(num>0){
      dig = num%10;
      rev = (rev*10)+dig;
      num = num/10;
    }
    if(originalNumber == rev){
      System.out.println(true);
    }else{
      System.out.println(false);
    }
	}
}
