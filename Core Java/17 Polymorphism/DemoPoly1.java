// Display.java
package test;
public class Display {
	private int k = 10;
	protected int z = 100;
	private void m() {
		System.out.println("===Private m()===");
		System.out.println("The value k :"+k);
	}
	protected void show() {
		System.out.println("===Protected show()===");
		System.out.println("The value z :"+z);
	}
	public void dis() {
		this.m(); //private method call.
	}
}


// DemoPloy1.java(main class)
package maccess;
import test.*;
public class DemoPloy1 extends Display {
	public static void main(String[] args) {
		Display d = new Display();
		//d.m();  er
		//d.show();  er
		d.dis();
		DemoPloy1 dp = new DemoPloy1();  //cclass_object
		dp.show();  //protected_method _call
	}
}
