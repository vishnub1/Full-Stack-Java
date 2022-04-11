// ITest.java
package test;
public interface ITest {
	public abstract void m2(int y);
	public abstract void dis(int z);
}

// PClass.javapackage test;
public class PClass {
	public void m1(int x) {
		System.out.println("===m1(x)===");
		System.out.println("x :"+x);
	}
	public void dis(int z) {
		System.out.println("===PClass dis(z)===");
		System.out.println("z :"+z);
	}
}

// CClass.javapackage test;
public class CClass extends PClass implements ITest {
	public void m2(int y) {
		System.out.println("==m2(y)==");
		System.out.println("y :"+y);
	}
}

// DemoMultipleInheritance2.java(main class)
package maccess;
import test.*;
public class DemoMultipleInheritance2 {
	public static void main(String[] args) {
		CClass ob = new CClass();
		ob.m1(123);
		ob.m2(353);
		ob.dis(566);
	}
}
