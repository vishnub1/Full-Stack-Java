// ITest.java
package test;
public interface ITest {
	public abstract void m1(int x);
}


// Create.java
package test;
public class Create {
	public static ITest getRef() {
		//lambda Expression
		return (int x)->
		{
			System.out.println("==m1(x)==");
			System.out.println("The value x:"+x);
		};
	}
}


// DemoCreation3.java
package maccess;
import test.*;
	public class DemoCreation3{
		public static void main(String[] args) {
			ITest ob = Create.getRef();
			ob.m1(333);
		}
	}
