// ITest.java
package Generalization2;
public interface ITest {
	public abstract void m1(int x);
}


// IClass.java
package Generalization2;
public class IClass implements ITest {
	public void m1(int x) {
		System.out.println("==m1(x)==");
		System.out.println("The value x:"+x);
	}
	public void m2(int y) {
		System.out.println("===m2()===");
		System.out.println("The value y :"+y);
	}
}

// DemoGeneralization2.java(main Class)
package Generalization2;
public class DemoGeneralization2 {
	public static void main(String[] args) {
		ITest ob = new IClass();
		ob.m1(123);
//		ob.m2(333)  //error
	}
}

