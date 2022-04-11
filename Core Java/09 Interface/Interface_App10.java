//ITest1.java
package test;
public interface ITest1 {
	public abstract void m1(int x);
}


// ITest2.java
package test;
public interface ITest2 {
	public abstract void m2(int y);
}



// ITest3.java
package test;
public interface ITest3 extends ITest1,ITest2 {
	public abstract void m3(int z);
}



// IClass.java
package test;
public class IClass implements ITest3 {
	public void m1(int x) {
		System.out.println("x :"+x);
	}
	public void m2(int y) {
		System.out.println("y :"+y);
	}
	public void m3(int z) {
		System.out.println("z :"+z);
	}
}

// DemoMultipleInheritance3.java(main class)
package maccess;
import test.*;
public class DemoMultipleInheritance3 {
	public static void main(String[] args) {
		IClass ob = new IClass();
		ob.m1(123);
		ob.m2(333);
		ob.m3(777);
	}
}
