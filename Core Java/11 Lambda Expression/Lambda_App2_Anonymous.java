// IArithemetic.java
IArithemetic.java
package test;
public interface IArithemetic {
	public abstract void calculate(int x, int y);
}


// Anonymous3.java(main class)
package maccess;
import test.*;
import java.util.*;
public class Anonymous3 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the value 1:");
	int v1 = sc.nextInt();
	System.out.println("Enter the value 2:");
	int v2 = sc.nextInt();
	System.out.println("==choice==");
	System.out.println("1.add\n2.sub\n3.mul\n4.div\n5.mmodDiv");
	System.out.println("Enter the choice :");
	int choice = sc.nextInt();
	switch(choice) {
	case 1:
		//anonymous inner class as implementation class
		IArithemetic ad = new IArithemetic()
		{
			public void calculate(int x,int y) {
				System.out.println("Sum :"+(x+y));
			}
		};
		ad.calculate(v1, v2);
		break;
	case 2:
		IArithemetic sb = new IArithemetic() {
			
			@Override
			public void calculate(int x, int y) {
				System.out.println("sub :"+(x-y));
			}
		};
		sb.calculate(v1, v2);
		break;
	case 3:
		IArithemetic ml = new IArithemetic() {
			
			@Override
			public void calculate(int x, int y) {
				System.out.println("Mul :"+(x*y));
			}
		};
		ml.calculate(v1,v2);
		break;
	case 4:
		IArithemetic dv = new IArithemetic() {
			
			@Override
			public void calculate(int x, int y) {
				System.out.println("Div :"+(float)(x/y));
			}
		};
		dv.calculate(v1, v2);
		break;
	case 5:
		IArithemetic md = new IArithemetic() {
			
			@Override
			public void calculate(int x, int y) {
			    System.out.println("Mod div :"+(x%y));
			}
		};
		md.calculate(v1, v2);
		break;
		default:
			System.out.println("Invalid choice ..");
	}//end of switch
	sc.close();
	}
}
