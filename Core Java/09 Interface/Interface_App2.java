// ITest
package test;
public interface ITest {
	public abstract void m1(int x);
	public abstract void m2(int y);
}


// IClass
package test;
public class IClass implements ITest{
		public void m1(int x) {
			System.out.println("===The value m1(x)==");
			System.out.println("The vlaue x:"+x);
		}
		public void m2(int y) {
			System.out.println("==The value m2(y)==");
			System.out.println("The value y :"+y);
	}
		public void dis(int z) {
		System.out.println("==The value dis(z)==");
		System.out.println("The value z :"+z);
	}
}



// DemoInterface2
package maccesss;
import java.util.*;
import test.*;
public class DemoInterface2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value fo x :");
		int x = sc.nextInt();
		System.out.print("Enter the value fo y :");
		int y = sc.nextInt();
		System.out.print("Enter the value fo z :");
		int z = sc.nextInt();
		IClass ob = new IClass();   //implimentation object
		ob.m1(x);
		ob.m2(y);
		ob.dis(z);
		sc.close();
	}
}
