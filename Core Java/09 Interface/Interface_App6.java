// AClass1.java
package test;
public abstract class AClass1 {
	public abstract void m1(int x);
}

// AClass2.java
package test;
public abstract class AClass2 extends AClass1 {
	public abstract void m2(int y) ;
}

// EClass.java
package test;
public class EClass extends AClass2 {
	public void m1(int x) {
		System.out.println("x :"+x);
	}
	public void m2(int y) {
		System.out.println("y :"+y);
	}
}


// DemoAbstractClass.javapackage maccess;
import test.*;
public class DemoAbstractClass {
	public static void main(String[] args) {
		EClass ob = new EClass();
		ob.m1(123);
		ob.m2(234);
	}
}

