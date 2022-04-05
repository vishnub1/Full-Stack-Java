// PClass.java
package test;
public class PClass {
	public void m(int x) {
		System.out.println("==PClass m(x)");
		System.out.println("The value x:"+x);
	}
}

// CClass.java
package test;
public class CClass extends PClass {
	public void m(int k) {
		System.out.println("==CClass m(k)==");
		System.out.println("The Value k:"+k);
	}
}


// DemoInheritance.java
//Case-1 : Instance method Overriding process
package maccess;
import test.*;
public class DemoInheritance6 {
	public static void main(String[] args) {
		CClass ob = new CClass();
		ob.m(123);
	}
}

//o/p:
//====CClass m(k)====
//The value k:123
