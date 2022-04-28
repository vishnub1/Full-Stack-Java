// CTest.java
// SingleTon Class Design Pattern 
package test;
public class CTest {
	private static CTest ob = null;
	private CTest() {}  //private constructor
		static {
			ob = new CTest();  //object creation
		}
		public static CTest getRef() {
			return ob;
	}
		public void dis(int k) {
			System.out.println("===dis(k)===");
			System.out.println("The value k :"+k);
	   }
}


// DemoPloy2.java
package test;
import java.util.Scanner;
public class DemoPloy2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the value of k:");
		int k = scn.nextInt();
//		CTest ob = new CTest();  //con_call_error
		CTest ob = CTest.getRef();  //Accessing object reference
		ob.dis(k);
		scn.close();
	}
}
