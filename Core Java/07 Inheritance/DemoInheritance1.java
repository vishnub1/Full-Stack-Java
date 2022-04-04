//PClass.java
package test;
public class PClass {
	public int a=10;
	public void m1()
	{
		System.out.println("==PClass M1()==");
		System.out.println("Value of a :"+a);		
	}
	{
		System.out.println("==PClass Instance block==");
		System.out.println("The value of a :"+a);
	}
}

//PClass.java
package test;
public class CClass extends PClass {
	public int b=20;
	public void m2()
	{
		System.out.println("==CClass m2()==");
		System.out.println("The value of b:"+b);
	}
	{
		System.out.println("CClass Instance Block==");
		System.out.println("The value of b :"+b);
	}
}


//Case-1 : NonStatic members from the ParentClass/SuperClass
//Inheritance_Ex1.java
package maccess;
import test.*;
public class Inheritance_Ex1 {
	public static void main(String[] args) {
		CClass ob = new CClass();
		ob.m1();
		ob.m2();
	}
}
