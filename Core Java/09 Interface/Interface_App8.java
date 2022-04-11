// ITest1.java
package test;
public interface ITest1 {
	public static final int k=10;
	public abstract void m(int x);
}



// ITest2.java
package test;
public interface ITest2 {
	public static final int k =20;
	public abstract void m(int x);
}



// IClass.java
package test;
public class IClass implements ITest1,ITest2 {
	public void m(int x) { //Implemented method
		System.out.println("==m(x)====");
		System.out.println("x :"+x);
	}
	public void dis() {
		System.out.println("==disp ===");
		System.out.println("ITest 1 k :"+ITest1.k);
		System.out.println("ITest 2 k :"+ITest2.k);
	}
}
	

// DemoMultipleInheritance1.java(main class)
package maccess;
import test.*;
public class DemoMultipleInheritance1 {
	public static void main(String[] args) {
		IClass ob = new IClass();
		ob.m(123);
		ob.dis();
	}
}

