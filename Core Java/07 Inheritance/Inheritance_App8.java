// CClass.java
package test;
public class PClass {
	public void m(int a) {
		System.out.println("==PCLass m(a)==");
		System.out.println("The value a :"+a);
	}
	public void m(int a,int b) {
		System.out.println("==PClass m(a,b)");
		System.out.println("THe value a :"+a);
		System.out.println("THe value b :"+b);
		
	}
}


// PClass.java
package test;
public class CClass extends PClass {
	public void m(int a,int b,int c) {
		System.out.println("==CCass m(a,b,c)==");
		System.out.println("The value a :"+a);
		System.out.println("The value b :"+b);
		System.out.println("The value c :"+c);
	}
	public void m(int a,int b,int c,int d) {
		System.out.println("==CClass m(a,b,c,d)==");
		System.out.println("The Value a :"+a);
		System.out.println("The Value b :"+b);
		System.out.println("The Value c :"+c);
		System.out.println("The Value d :"+d);
	}
}


// DemoInheritance8.java
package maccess;
import test.*;
import java.util.Scanner;
public class DemoInheritance8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value a :");
		int a=sc.nextInt();
		System.out.println("Enter the value b :");
		int b=sc.nextInt();
		System.out.println("Enter the value c :");
		int c=sc.nextInt();
		System.out.println("Enter the value d :");
		int d=sc.nextInt();
		CClass ob = new CClass();
		System.out.println("==Choice==");
		System.out.println("1.m(a)\n2.m(a,b)\n3.m(a,b,c)\n4.m(a,b,c,d)");
		System.out.println("Enter the choice");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			ob.m(a);
			break;
		case 2: 
			ob.m(a,b);
			break;
		case 3: 
			ob.m(a,b,c);
			break;
		case 4: 
			ob.m(a,b,c,d);
			break;
		default:
			System.out.println("invalid Choice...");
		}//end of switch
		sc.close();
		}
	}
