// ITest.java
package test;
public interface ITest {
	public abstract void m1(int x);
}


// DemoLambdaExpression1.java(main class)
package maccess;
import test.*;
public class DemoLambdaExpression1 {
	public static void main(String[] args) {
		ITest ob = (int x)->
		{
			System.out.println("==m1(x)==");
			System.out.println("The value x:"+x);
		};
		ob.m1(123);
	}
}
