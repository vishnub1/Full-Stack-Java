//IComparable.java
package test;
public interface IComparable {
	public abstract int compareTo(int x,int y);
}


// DemoLambda3.java(main class)
package maccess;
import java.util.*;
import test.*;
public class DemoLambda3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value 1:");
		int v1 = sc.nextInt();
		System.out.println("Enter the value 2:");
		int v2 = sc.nextInt();
		System.out.println("===choice===");
		System.out.println("1.Greater \n2.Smaller");
		System.out.println("Enter the choice..");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			IComparable gt = (int x, int y)->
			{
				if(x>y)return x;
				else return y;
			};
			System.out.println("Greater value :"+gt.compareTo(v1, v2));
			break;
		case 2:
			IComparable sm = (int x,int y)->
			{
				if(x<y)return x;
				else return y;		
			};
			System.out.println("Smaller value :"+sm.compareTo(v1, v2));
			break;
		default :
			System.out.println("Invalid choice..🙄");			
		}	
		sc.close();
	}
}
