// PClass.java
package test;
public class PClass {
	public void m1(int x) {
		System.out.println("==PClass m1(x)===");
		System.out.println("The value x:"+x);
	}
	public void m2(int y) {
		System.out.println("==Pclass m2(y)===");
		System.out.println("The value y:"+y);	
	}
}


// Anonymous1.java
package maccess;
import test.*;
public class Anonymous1 {
	public static void main(String[] args) {
		PClass ob = new PClass() 
		{
			public void m1(int x) 
			{
				System.out.println("==CClass m1(x)==");
				System.out.println("The value x :"+x);
			}
			public void m2(int y) 
			{
				System.out.println("==CClass m2(x)==");
				System.out.println("The value x :"+y);
			}
			public void m3(int z)
			{
				System.out.println("==PClass m3(z)");
				System.out.println("The value z:"+z);
			}
		};
			ob.m1(123);
			ob.m2(232);
		//	ob.m3(233);
	}
}
