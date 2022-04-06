// PClass.java
package test;
public class PClass {
	public PClass(int a) {
		System.out.println("==PClass(a)==");
		System.out.println("The value a:"+a);
	}
	public PClass(int a, int b) {
		this(a);
		System.out.println("==PClass (a,b)==");
		System.out.println("The value a:"+a);
		System.out.println("The value b:"+b);
	}
}

// CClass.java
package test;
public class CClass extends PClass {
	public CClass(int a,int b, int c) {
		super(a, b);
		System.out.println("====CClass(a,b,c)====");
   	 	System.out.println("The value a:"+a);
   		System.out.println("The value b:"+b);
   		System.out.println("The value c:"+c);
	}
	public CClass (int a,int b,int c,int d) {
		this(a, b, c);
		 System.out.println("====CClass(a,b,c,d)====");
    	 System.out.println("The value a:"+a);
    	 System.out.println("The value b:"+b);
    	 System.out.println("The value c:"+c);
    	 System.out.println("The value d:"+d);		
	}
}


// DemoInheritance11.java
package maccess;
import java.util.*;
import test.*;
public class DemoInheritance11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the value of a:");
		int a= sc.nextInt();
		System.out.println("Enter the value of b:");
		int b= sc.nextInt();
		System.out.println("Enter the value of c:");
		int c= sc.nextInt();
		System.out.println("Enter the value of d:");
		int d= sc.nextInt();
		//CClass ob = new CClass(a, b, c); //CClass_con_call
		CClass ob = new CClass(a, b, c,d); //CClass_con_call
		sc.close();
	}	
}
