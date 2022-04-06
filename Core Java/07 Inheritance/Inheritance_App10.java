// PClass.java
package test;
public class PClass {
	public PClass(int a) {
		System.out.println("===PClass (a)===");
		System.out.println("The value a :"+a);
	}
	public PClass(int a,int b) {
		System.out.println("===PClass (a,b)===");
		System.out.println("The value a :"+a);
		System.out.println("The value b :"+b);
	}
}


// CClass.java
package test;
public class CClass extends PClass {
	public CClass(int a, int b, int c) {
		super(a);
		System.out.println("===CClass (a,b,c)===");
		System.out.println("The value a :"+a);
		System.out.println("The value b :"+b);
		System.out.println("The value c :"+c);		
	}
	public CClass (int a,int b, int c, int d) {
   	 	super(a,b);
   	 	System.out.println("===CClass (a,b,c,d)===");
   	 	System.out.println("The value a :"+a);
   	 	System.out.println("The value b :"+b);
   	 	System.out.println("The value c :"+c);	
   	 	System.out.println("The value d :"+d);	
	}
}


// DemoInheritance10.java
package maccess;
import java.util.*;
import test.*;

public class DemoInheritance10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("The value of a :");
		int a = sc.nextInt();
		System.out.println("The value of b :");
		int b = sc.nextInt();
		System.out.println("The value of c :");
		int c = sc.nextInt();
		System.out.println("The value of d :");
		int d = sc.nextInt();
        System.out.println("====Choice====");
        System.out.println("1.CClass(a,b,c)\n2.CClass(a,b,c,d)");
        System.out.println("Enter the Choice:");
        int choice = sc.nextInt();
        switch(choice)
        {
        case 1:
        	CClass ob1 = new CClass(a,b,c);//CClass_Con_Call
        	break;
        case 2:
        	CClass ob2 = new CClass(a,b,c,d);//CClass_Con_Call
        	break;
        default:
        	System.out.println("Invalid choice...");
        }//end of switch
        sc.close();
	}
}
