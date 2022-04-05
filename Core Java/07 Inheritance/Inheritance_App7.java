// CClass.java
package test;
public class PClass {
	public static void m(int x) {
		System.out.println("==PClass static method m(x)==");
		System.out.println("The value x:"+x);
	}
}


// PClass.java
package test;
public class CClass extends PClass {
	public static void m(int k) {
		System.out.println("This is CCLass m(k)");
		System.out.println("The value K :"+k);
	}
}


// DemoInheritance7.java
//define Method Hiding process?
//  =>when we have same static method signature in PClass and CClass,then 
//PClass method is hided by CClass method while execution process,is known as
//Method Hiding Process


package maccess;
import test.*;
public class DemoInheritance7 {
	public static void main(String[] args) {
		CClass.m(12);
	}
}
//This is CCLass m(k)
//The value K :12
