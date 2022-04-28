//ITest.java
package test;
public interface ITest {
	public abstract void dis(int k);
}


//Display.java
package test;
public class Display {
	public Display(int x) {
		System.out.println("==Constructor ==");
		System.out.println("The value x: "+x);
	}
	public void m1(int y) {
		System.out.println("==instance method===");
		System.out.println("The value y :"+y);
	}
	public static void m2(int z) {
		System.out.println("===static method===");
		System.out.println("The value z :"+z);
	}
}



// DemoMethodReference.java
package maccess;
import test.*;
public class DemoMethodReference {
	public static void main(String[] args) {
		ITest ob = Display::new;  //Reference to constructor
		ob.dis(123);  //constructor body is executed
		
		Display d = new Display(200);  //con_calll
		ITest ob2  = d::m1;  //reference to instance method
		ob2.dis(123); //Instance method body is exicuted
		
		ITest ob3 = Display :: m2;//reference to static method
		ob3.dis(222);//static  method body is executed
		
	}
}
