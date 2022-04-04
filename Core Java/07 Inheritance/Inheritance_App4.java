// PClass.java
package test;
public class PClass {
	public static int a=10;
	public static void m1() {
		System.out.println("==PClass m1()==");
		System.out.println("The value of a :"+a);
	}
	static{
		System.out.println("==PClass static block");
		System.out.println("The vlaue of a :"+a);
	}

}

// CClass.java
package test;
public class CClass extends PClass {
	public static int b =200;
	public static void m2() {
		System.out.println("==CClass M2()==");
		System.out.println("The value of B :"+b);
	}
	static {
		System.out.println("== static block CClass");
		System.out.println("The vlue of b :"+b);
	}
}

//: Static members from the ParentClass/SuperClass
//  =>In Inheritance process all the static members of PClass are available to
//CClass and can be accessed with CClass_name.

//DemoInheritance4.java
package maccess;
import test.*;
public class DemoInheritance4 {
	public static void main(String[] args) {
		System.out.println("== Using class name ===");
		CClass.m1();
		CClass.m2();
	}
}

