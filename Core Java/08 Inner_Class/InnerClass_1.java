
//SubClass1.java
package test;
public class SubClass1 {
	public int a=10;
	public static int b =20;
	public void m1() {
		System.out.println("***Outer Class m1()***");
		System.out.println("The value a:"+a);
		System.out.println("The value b:"+b);
	}  //outer class method
	public static class SubClass2{
		public int x=10;
		public static int y=200;
		public void m2() {
			System.out.println("***Instance method m2()***");
//		    System.out.println("OuterClass value a:"+a);//Error
			System.out.println("Outer value b "+b);
			System.out.println("Inner value x "+b);
			System.out.println("Inner value y "+b);
		}
		public static void m22() {
			System.out.println("***Static method m22()***");
//			System.out.println("Outer class value :"+a);
			System.out.println("Outer class value :"+b);
//			System.out.println("Inner class value :"+x);
			System.out.println("Inner class value :"+y);
		}
	}
}



// DemoInnerClass1
package maccess;
import test.SubClass1;
public class DemoInnerClass1 {
	public static void main(String[] args) {
		SubClass1 ob1 = new SubClass1();
		ob1.m1();
		SubClass1.SubClass2 ob2 = new SubClass1.SubClass2();
		ob2.m2();
		SubClass1.SubClass2.m22();
	}
}
