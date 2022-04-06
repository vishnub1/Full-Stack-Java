// PClass.java
package test;
public class PClass {
	public void m(int a) {
		System.out.println("==PClass m(a)==");
		System.out.println("The value a:"+a);
	}
	public void m(int a, int b) {
		this.m(a);
		System.out.println("==PClass m(a,b)==");
		System.out.println("The value a:"+a);
		System.out.println("The value b:"+b);		
	}
}

// CClass.java
package test;
public class CClass extends  PClass {
	public void m(int a, int b,int c) {
		super.m(a,b);
		System.out.println("===CClass m(a,b,c)===");
		System.out.println("The value a :"+a);
		System.out.println("The value b :"+b);
		System.out.println("The value c :"+c);
	}
	public void m(int a,int b,int c,int d)
	   {
		    this.m(a,b,c);  //method_call_from_same_class
		     System.out.println("===CClass m(a,b,c,d)====");
			 System.out.println("The value a:"+a);
			 System.out.println("The value b:"+b);
			 System.out.println("The value c:"+c);
			 System.out.println("The value d:"+d);
	   }
}

// DemoInheritance9.java
package maccess;
import java.util.*;
import test.*;
public class DemoInheritance9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a:");
        int a = sc.nextInt();
        System.out.println("Enter the value of b:");
        int b = sc.nextInt();
        System.out.println("Enter the value of c:");
        int c = sc.nextInt();
        System.out.println("Enter the value of d:");
        int d = sc.nextInt();
        CClass ob = new CClass();
        ob.m(a,b,c,d);
        sc.close();
	}
}

