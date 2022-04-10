// SubClass1
package test;
public class SubClass1 {
	public int a=10;
	public static int b=20;
	public void m1() {
		System.out.println("==Outer class m1()==");
		System.out.println("The value a: "+a);
		System.out.println("The value b:"+b);
	}//outer class method
	public class SubClass2{
		public int x=100;
		public static int y =100;
		public void m2() {
			System.out.println("==Inner class Instance method m2()==");
			System.out.println("Outer class value a :"+a);
			System.out.println("Outer class value b :"+b);
			System.out.println("Inner class value x :"+x);
			System.out.println("Inner class value y :"+y);	
		}
		public static void m22() {
			System.out.println("==Inner class static m22() ==");
//			System.out.println("Ouetrclass value a:"+a);
			System.out.println("outerClass value b:"+b);
//			System.out.println("InnerClass value x:"+x);
			System.out.println("InnerClass value y:"+y);	
		}	
	}
}



// DemoInnerClass2
package maccess;
import test.*;
public class DemoInnerClass2 {
	public static void main(String[] args) {
		SubClass1 ob = new SubClass1();
		ob.m1();   //outer class method call
		SubClass1.SubClass2 ob2 = ob.new SubClass2();  //Instance member InnerClass_object
		ob2.m2();  //inner Class Instance_method_class
		SubClass1.SubClass2.m22();   //InnerClass
	}
}
