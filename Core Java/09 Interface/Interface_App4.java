// ITest1.javapackage test;
public interface ITest1 {
	public void m1(int x);
}


// ITest2.java
package test;
public interface ITest2 extends ITest1 {
	public void m2(int y);
}


// IClass.java
package test;
public class IClass implements ITest2 {
	public void m1(int x) {
		System.out.println("X :"+x);
	}
	public void m2(int y) {
		System.out.println("Y :"+y);
	}
}


// DemoInterface4.java
package maccess;
import test.*;
public class DemoInterface4 {
	public static void main(String[] args) {
		IClass ob = new IClass();
		ob.m1(12);
		ob.m2(13);
	}
}
