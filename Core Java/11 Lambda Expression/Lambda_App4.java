// IArithemetic
package test;
public interface IComparable {
	public abstract int compareTo(int x,int y);
}

// DemoAnonymous4.java(main class)
package maccess;
import java.util.*;
import test.*;
public class DemoAnonymous4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the value 1:");
		int v1 = scanner.nextInt();
		System.out.println("Enter the value 2:");
		int v2 = scanner.nextInt();
		System.out.println("==Choice==");
		System.out.println("1.Greater\n2.Smaller");
		System.out.println("Enter tge choice:");
		int choice = scanner.nextInt();
		switch(choice) {
		case 1:
			//Anonymous Inner class as implementation class
			IComparable gt = new IComparable() {
				
				@Override
				public int compareTo(int x, int y) {
					if (x>y)return x;
					else return y;
				}
			};
			System.out.println("Greater value :"+gt.compareTo(v1, v2));
			break;
		case 2:
			//Anonymous Inner class as implementation class
			IComparable sm = new IComparable() {
				
				@Override
				public int compareTo(int x, int y) {
					if (x<y)return x;
					else return y;
				}
			};
			System.out.println("Greater value :"+sm.compareTo(v1, v2));
			break;
		default:
			System.out.println("Invalid choice...");
		}//end of switch.
		scanner.close();		
	}
}
