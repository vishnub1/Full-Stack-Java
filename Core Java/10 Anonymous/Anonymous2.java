// PClass.java
package test;
public class PClass {
	public void m1(int x) {
		System.out.println("==PClass m1(x)=");
		System.out.println("The value of x"+x);
	}
	public void m2(int y) {
		System.out.println("==PClasss m2(y)==");
		System.out.println("The value of x"+y);
	}
	public void m3(int z) {
		System.out.println("==PClasss m2(z)==");
		System.out.println("The value of x"+z);
	}

}

// Anonymous2.java
package maccess;
import test.*;
public class Anonymous2 {
	public static void main(String[] args) {
		PClass ob = new PClass() 
		{
			public void m1(int x) {
				System.out.println("===Main m1(x)==");
				System.out.println("The value x"+x);
		}
			public void m2(int y) {
				System.out.println("==main m2(y)==");
				System.out.println("The value y:"+y);
		}
			public void m3(int z) {
				System.out.println("==main m3(z)==");
				System.out.println("The value z:"+z);
			}
			public void m33(int a) {
				System.out.println("==main m3(z)==");
				System.out.println("The value z:"+a);
			}
		};
		ob.m1(123);
		ob.m2(777);
		ob.m3(1343);
	//	ob.m33(1331);
	}
}
